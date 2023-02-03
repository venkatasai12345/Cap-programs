class Solution {
    Stack<TreeNode> stack=new Stack<>();
    public int next() {
        TreeNode temp=stack.pop();
        pushall(temp.right);
        return temp.val;
    }
    public void pushall(TreeNode node){
        while(node!=null){
            stack.push(node);
            node=node.left;
        }
    }
    int man;
    public int kthSmallest(TreeNode root, int k) {
        pushall(root);
        
        for(int i=0;i<k;i++){
           man=next();
        }
        return man;
    }
}
