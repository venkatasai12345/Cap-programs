class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node=new TreeNode(val);
        if(root==null){
            root=node;
            return root;
        }
        if(root.val>val){
           TreeNode fun= insertIntoBST(root.left,val);
           root.left=fun;
        }else{
        TreeNode gun=insertIntoBST(root.right,val);
        root.right=gun;
        }
        return root;

    }
}
