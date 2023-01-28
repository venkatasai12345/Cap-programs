class Solution {
    int max;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int m=maxDepth(root.left);
        int n=maxDepth(root.right);
        if(m>n){
            return m+1;
        }
        return n+1;
    }
}
