class Solution {
    TreeNode prev=null;
    public TreeNode flat(TreeNode root){
        if(root==null){
            return null;
        }
        flat(root.right);
        flat(root.left);
        root.left=null;
        root.right=prev;
        prev=root;
        return root;
    }
    public void flatten(TreeNode root) {
        flat(root);
    }
}
