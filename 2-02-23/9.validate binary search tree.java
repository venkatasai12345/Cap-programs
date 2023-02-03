class Solution {
    boolean check(TreeNode root,Integer min,Integer max){
        if(root==null){
            return true;
        }
        if((max!=null && root.val>=max) || (min!=null && root.val<=min)){
            return false;
        }
        return check(root.left,min,root.val) && check(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        return check(root,null,null);
    }
}
