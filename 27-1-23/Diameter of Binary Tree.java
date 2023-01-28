class Solution {
    int max;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int m=maxDepth(root.left);
        int n=maxDepth(root.right);
        if(m+n+1>max){
            max=m+n;
        }
        return Math.max(m,n)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
}
