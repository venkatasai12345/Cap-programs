class Solution {
    public TreeNode mergeTrees(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return null;
        }
        if(q==null){
            return p;
        }
        if(p==null){
            return q;
        }
        TreeNode m=mergeTrees(p.left,q.left);
        TreeNode n=mergeTrees(p.right,q.right);
        q.val=p.val+q.val;
        q.left=m;
        q.right=n;
        return q;
    }
}
