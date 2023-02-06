class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    boolean []visited;
    public void fun(int source,ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> que=new LinkedList<>();
        que.add(source);
        list.add(source);
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                int n=que.poll();
                visited[source]=true;
                for(int k:adj.get(n)){
                   if(!visited[k]){
                       visited[k]=true;
                       list.add(k);
                       que.add(k);
                   } 
                }
            }
        }
    }
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        visited=new boolean[V];
        fun(0,adj);
        return list;
        
    }
}
