class Solution {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int m=maxDepth(root.left);
        int n=maxDepth(root.right);
        return Math.max(m,n)+1;
    }
}
