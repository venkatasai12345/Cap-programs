class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
         
        if(root==null){
            
            return list;
        }
        Queue<TreeNode> man=new LinkedList<>();
        man.add(root);
        while(!man.isEmpty()){
            int size=man.size();
            List<Integer> fun=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=man.poll();
                fun.add(temp.val);
                if(temp.left!=null){
                    man.add(temp.left);
                }if(temp.right!=null){
                    man.add(temp.right);
                }
            }
            list.add(fun);
        }
     return list;
    }
}
