package Graph;
import java.security.interfaces.EdECKey;
import java.util.*;
public class PrimsAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void CreateGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3,1 , 40));
        graph[3].add(new Edge(3, 2, 50));

    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        Pair(int v,int cost){
            this.cost=cost;
            this.v=v;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void primsAlgorithm(ArrayList<Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair>pq=new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int fianlcost=0;

        while (!pq.isEmpty()) {
            Pair curr=pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v]=true;

                fianlcost+=curr.cost;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("final cost="+fianlcost);
    }
    public static void main(String args[]){
      int V=4;
      ArrayList<Edge>graph[]=new ArrayList[V];
      CreateGraph(graph);
      primsAlgorithm(graph);
    }
}
