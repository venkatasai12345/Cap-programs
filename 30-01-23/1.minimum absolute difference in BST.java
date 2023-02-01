class Solution {
    TreeNode last;
    int min=Integer.MAX_VALUE;
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
    public int getMinimumDifference(TreeNode root) {
        min(root);
        return min;
    }
}
