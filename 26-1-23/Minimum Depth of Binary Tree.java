class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int m=minDepth(root.left);
        int n=minDepth(root.right);
        if(m==0 && n==0){
            return m+1;
        }
        if(m==0 && n!=0){
            return n+1;
        }
        if(n==0 && m!=0){
            return m+1;
        }
        if(m<n){
            return m+1;
        }
        return n+1;
    }
}
