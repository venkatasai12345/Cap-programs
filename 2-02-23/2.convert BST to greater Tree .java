class Solution {
    int max=0;
    public TreeNode man(TreeNode root){
        if(root==null){
            return null;
        }
        man(root.right);
        max=max+root.val;
        root.val=max;
        man(root.left);
        return root;

    }
    public TreeNode convertBST(TreeNode root) {
        return man(root);

    }
}
