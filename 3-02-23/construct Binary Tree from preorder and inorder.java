class Solution {
    int prenode=0;
    public TreeNode construct(int []pre, int[] in,int a,int b,Map<Integer,Integer> man){
        if(a>b){
            return null;
        }
        TreeNode root=new TreeNode(pre[prenode]);
        int mid=man.get(pre[prenode]);
        prenode++;
        root.left=construct(pre,in,a,mid-1,man);
        root.right=construct(pre,in,mid+1,b,man);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return construct(preorder,inorder,0,inorder.length-1,map);
    }
}
