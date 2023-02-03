class Solution {
    List<Integer> list=new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode insert(List<Integer> nums, int a,int b) {
        if(a>b){
            return null;
        }
        int mid=(a+b)/2;
        TreeNode node=new TreeNode(nums.get(mid));
        node.left=insert(nums,a,mid-1);
        node.right=insert(nums,mid+1,b);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return insert(list,0,list.size()-1);

    }
}
