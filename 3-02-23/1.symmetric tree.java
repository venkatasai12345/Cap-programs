class Solution {
    public boolean same(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        boolean m=same(p.left,q.right);
        boolean n=same(p.right,q.left);
        if(m && n && p.val==q.val){
            return true;
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        return same(root.left,root.right);
    }
}
