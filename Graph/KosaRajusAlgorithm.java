package Graph;
import java.util.*;
public class KosaRajusAlgorithm {
    static class Edge{
        int src;
        int des;
        Edge(int s,int d){
            this.src=s;
            this.des=d;
        }
    }

    public static void CreateGraph(ArrayList<Edge>graph[]){
      for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
      }
      graph[0].add(new Edge(0, 2));
      graph[0].add(new Edge(0, 3));

      graph[1].add(new Edge(1, 0));

      graph[2].add(new Edge(2, 1));

      graph[3].add(new Edge(3, 4));
    }
    public static void topSort(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>s){
          vis[curr]=true;
         

          for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if (!vis[e.des]) {
                topSort(graph, e.des, vis, s);
            }
          }
          s.push(curr);
    }
    public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if (!vis[e.des]) {
               dfs(graph, e.des, vis); 
            }
            
        }
    }
    public static void kosaRajuAlgo(ArrayList<Edge>graph[],int V){
        //step1
        Stack<Integer>s=new Stack<>();
        boolean vis[]=new boolean[V];

        for(int i=0;i<V;i++){
             if (!vis[i]) {
                topSort(graph,i,vis,s);
             }
        }
        //step2
        ArrayList<Edge>transpose[]=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false;
            transpose[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.des].add(new Edge(e.des, e.src));
            }
        }
        //step 3
        while (!s.isEmpty()) {
            int curr=s.pop();
            if (!vis[curr]) {
                System.out.print("SCC-->");
                dfs(transpose, curr, vis);
                System.out.println();
            }
           
        }
    }
    public static void main(String[] args) {
        int V=5;
    ArrayList<Edge>graph[]=new ArrayList[V];
    CreateGraph(graph);
    kosaRajuAlgo(graph, V);
    }
}
