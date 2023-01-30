class Solution {
    public TreeNode insert(int[] nums, int a,int b) {
        if(a>b){
            return null;
        }
        int mid=(a+b)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=insert(nums,a,mid-1);
        node.right=insert(nums,mid+1,b);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums,0,nums.length-1);

    }
}
