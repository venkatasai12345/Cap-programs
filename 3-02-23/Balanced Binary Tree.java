class Solution {
    boolean result=true;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int m=height(root.left);
        int n=height(root.right);
        int k=Math.abs(m-n);
        if(k!=0 && k!=1){
            result=false;
        }
        return Math.max(m,n)+1;
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        return result;
    }
}
