class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        list.add(root.val);
    }
}
