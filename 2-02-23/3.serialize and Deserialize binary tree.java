public class Codec {

    // Encodes a tree to a single string.
    String str="";
    public String serialize(TreeNode root) {
        if(root==null){
            
            return str;
        }
        Queue<TreeNode> man=new LinkedList<>();
        man.add(root);
        while(!man.isEmpty()){
            int size=man.size();
            for(int i=0;i<size;i++){
                TreeNode temp=man.poll();
                
                if(temp==null){
                    str=str+"# ";
                    continue;
                }
                str=str+String.valueOf(temp.val)+" ";
                man.add(temp.left);
                man.add(temp.right);
            }   
        }
        return str;
    }

    // Decodes your encoded data to tree
    int i=0;
    public TreeNode deserialize(String s) {
        if(s==""){
            return null;
        }
        String[] data=s.split("\\s");
        Queue<TreeNode> man=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(data[i++]));
        man.add(root);
        while(!man.isEmpty()){
            TreeNode temp=man.poll();
            if(i<data.length && !data[i].equals("#")){
                TreeNode fun=new TreeNode(Integer.parseInt(data[i]));
                temp.left=fun;
                man.add(fun);
            }
            i++;
            if(i<data.length && !data[i].equals("#")){
                TreeNode gun=new TreeNode(Integer.parseInt(data[i]));
                temp.right=gun;
                man.add(gun);
            }
            i++;
        }
        return root;
    }
}
