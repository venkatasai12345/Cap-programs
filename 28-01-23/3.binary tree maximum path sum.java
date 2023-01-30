class Solution {
    int max=Integer.MIN_VALUE;
    int maxval=Integer.MIN_VALUE;
    public int maxPath(TreeNode root) {
        if(root==null){
            return 0;
        }
        int m=Math.max(maxPath(root.left),0);
        int n=Math.max(maxPath(root.right),0);
        if(m+n+root.val>max){
            max=m+n+root.val;
        }
        return Math.max(m,n)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val;
        }
        maxPath(root);
        return max;
    }
}
