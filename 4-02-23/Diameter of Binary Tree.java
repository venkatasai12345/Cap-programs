class Solution {
    int max=0;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int m=height(root.left);
        int n=height(root.right);
        if(m+n+1>max){
            max=m+n+1;
        }
        return Math.max(m,n)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max-1;
    }
}
