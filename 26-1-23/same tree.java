class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        boolean m=isSameTree(p.left,q.left);
        boolean n=isSameTree(p.right,q.right);
        if(m && n && p.val==q.val){
            return true;
        }
        return false;
    }
}
