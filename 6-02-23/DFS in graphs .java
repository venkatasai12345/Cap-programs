class Solution {
    boolean[] visited;
    ArrayList<Integer> list=new ArrayList<>();
    public void fun(int source,ArrayList<ArrayList<Integer>> adj){
        visited[source]=true;
        list.add(source);
        for(int i :adj.get(source)){
            if(!visited[i]){
                fun(i,adj);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        visited=new boolean[V];
        fun(0,adj);
        return list;
    }
}
