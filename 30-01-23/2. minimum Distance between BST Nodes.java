class Solution {
    TreeNode last;
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        min(root);
        return min;
    }
    public void min(TreeNode root){
        if(root==null){
            return;
        }
        min(root.left);
        if(last!=null){
            int ban=Math.abs(last.val-root.val);
            min=Math.min(ban,min);
        }
        last=root;
        min(root.right);
    }
}
