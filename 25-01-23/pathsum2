class Solution {
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> fun=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();
        pathsum2(root,targetSum,list3,fun);
        return fun;
        
    }
    public void pathsum2(TreeNode root,int sum,List<Integer> list1,List<List<Integer>> list){
        if(root==null){
            return;
        }
        list1.add(root.val);
        if(root.left==null && root.right==null && sum==root.val){
            list.add(new ArrayList<Integer>(list1));
        }
        pathsum2(root.left,sum-root.val,list1,list);
        pathsum2(root.right,sum-root.val,list1,list);
        list1.remove(list1.size()-1);
    }
}
