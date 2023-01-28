class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int m=sumOfLeftLeaves(root.left);
        int n=sumOfLeftLeaves(root.right);
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum=sum+root.left.val;
        }
        return sum;
    }
}
