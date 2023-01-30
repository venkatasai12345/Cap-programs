class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int m=rangeSumBST(root.left,low,high);
        int n=rangeSumBST(root.right,low,high);
        if(root.val>=low && root.val<=high){
            return m+n+root.val;
        }
        return m+n;
    }
}
