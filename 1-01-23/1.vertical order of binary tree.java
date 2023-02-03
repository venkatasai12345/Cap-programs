class Solution {
    class Node{
        int row;
        int col;
        TreeNode data;
        Node(TreeNode data,int row,int col){
            this.data=data;
            this.row=row;
            this.col=col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Node> man=new LinkedList<>();
        man.add(new Node(root,0,0));
        while(!man.isEmpty()){
            Node temp=man.poll();
            TreeNode node=temp.data;
            int x=temp.row;
            int y=temp.col;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).add(node.val);
            if(node.left!=null){
                man.add(new Node(node.left,x-1,y+1));
            }
            if(node.right!=null){
                man.add(new Node(node.right,x+1,y+1));
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ob : map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> fun : ob.values()){
                    list.get(list.size()-1).add(fun.poll());
            }
        }
        return list;

    }
}
