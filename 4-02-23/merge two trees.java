class Solution {
    public TreeNode mergeTrees(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return null;
        }
        if(p==null){
            return q;
        }
        if(q==null){
            return p;
        }
        TreeNode m=mergeTrees(p.left,q.left);
        TreeNode n=mergeTrees(p.right,q.right);
        q.val=p.val+q.val;
        q.right=n;
        q.left=m;
        return q;
    }
}
