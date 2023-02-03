class Solution {
    public TreeNode preorder(int[] pre,int bound,int []a){
        if(a[0]==pre.length || pre[a[0]]>bound){
            return null;
        }
        TreeNode node=new TreeNode(pre[a[0]++]);
        node.left=preorder(pre,node.val,a);
        node.right=preorder(pre,bound,a);
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return preorder(preorder,Integer.MAX_VALUE,new int[]{0});
    }
}
