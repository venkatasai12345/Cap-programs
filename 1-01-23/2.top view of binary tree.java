public static void topView(Node root) {
        class TreeNode{
            Node t;
            int hd;
            TreeNode(Node t,int hd){
                this.t=t;
                this.hd=hd;
            }
        }
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        if(root==null){
            return;
        }
        Queue<TreeNode> man=new LinkedList<>();
        man.add(new TreeNode(root,0));
        while(!man.isEmpty()){
            TreeNode temp=man.poll();
            Node node=temp.t;
            int x=temp.hd;
            if(!map.containsKey(x)){
                map.put(x,new ArrayList<>());
            }
            map.get(x).add(node.data);
            if(node.left!=null){
                man.add(new TreeNode(node.left,x-1));
            }
            if(node.right!=null){
                man.add(new TreeNode(node.right,x+1));
            }
        }
        List<Integer> list=new ArrayList<>();
        for(List<Integer> obj:map.values()){
           System.out.print(obj.get(0)+" ");
        }
      
