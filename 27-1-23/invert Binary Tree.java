class Solution {      
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode m=invertTree(root.left);
        TreeNode n=invertTree(root.right);
            TreeNode temp=m;
            root.left=n;
            root.right=temp;
        return root;
    }
}
