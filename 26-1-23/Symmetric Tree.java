class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        boolean m=isSameTree(p.left,q.right);
        boolean n=isSameTree(p.right,q.left);
        if(m && n && p.val==q.val){
            return true;
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        return isSameTree(root.left,root.right);
    }
}
