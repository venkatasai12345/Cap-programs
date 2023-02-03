class Solution {
    Stack<TreeNode> stack1=new Stack<>();
    Stack<TreeNode> stack2=new Stack<>();
    public int farword() {
        TreeNode temp=stack1.pop();
        pushall(temp.right);
        return temp.val;
    }
    public void pushall(TreeNode node){
        while(node!=null){
            stack1.push(node);
            node=node.left;
        }
    }
     public boolean hasfarword(){
        return !stack1.isEmpty();
    }
    public boolean hasbackword(){
        return !stack2.isEmpty();
    }
    public int backword(){
        TreeNode temp=stack2.pop();
        pullall(temp.left);
        return temp.val;
    }
    public void pullall(TreeNode node){
        while(node!=null){
            stack2.push(node);
            node=node.right;
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        pushall(root);
        pullall(root);
        int m=farword();
        int n=backword();
        while(m+n!=k && m!=n){
            if(m+n>k){
                if(hasbackword()){
                    n=backword();
                }
                else{
                    return false;
                }
                
            }
            if(m+n<k){
                if(hasfarword()){
                    m=farword();
                }
                else{
                    return false;
                }
            }
        }
        if(m+n==k && m!=n){
            return true;
        }
            return false;
    }
}
