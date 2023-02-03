class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> man=new LinkedList<>();
        man.add(root);
        boolean gun=true;
        while(!man.isEmpty()){
            int size=man.size();
            LinkedList<Integer> fun=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=man.poll();
                if(gun){
                    fun.add(temp.val);
                }
                else{
                    fun.addFirst(temp.val);
                }
                if(temp.left!=null){
                    man.add(temp.left);
                }
                if(temp.right!=null){
                    man.add(temp.right);
                }
            }
            list.add(fun);
            gun=!gun;
        }
        return list;
    }
}
