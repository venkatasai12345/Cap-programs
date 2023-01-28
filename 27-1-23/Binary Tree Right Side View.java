class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> fun=new ArrayList<>();
        if(root==null){
            
            return fun;
        }
        Queue<TreeNode> man=new LinkedList<>();
        man.add(root);
        while(!man.isEmpty()){
            int size=man.size();
            for(int i=0;i<size;i++){
                TreeNode temp=man.poll();
                if(i==size-1){
                    fun.add(temp.val);
                }
                if(temp.left!=null){
                    man.add(temp.left);
                }if(temp.right!=null){
                    man.add(temp.right);
                }
            }
        }
     return fun;
    }
}
