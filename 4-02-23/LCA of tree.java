class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        TreeNode m=lowestCommonAncestor(root.left,p,q);
        TreeNode n=lowestCommonAncestor(root.right,p,q);
        if(m!=null && n!=null){
            return root;
        }
        if(m!=null){
            return m;
        }
        if(n!=null){
            return n;
        }
        return null;
    }
}
