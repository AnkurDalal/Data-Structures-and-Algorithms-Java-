package Graph;
import java.util.*;
public class ConnectingCities {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        Edge(int d,int c){
            this.dest=d;
            this.cost=c;
        }
        @Override
        public int compareTo(Edge e2){
            return this.cost-e2.cost;
        }
    }
    public static int connectingCities(int citites[][]){
        PriorityQueue<Edge>pq=new PriorityQueue<>();
        boolean vis[]=new boolean[citites.length];
        pq.add(new Edge(0, 0));
        int fianlcost=0;
        while (!pq.isEmpty()) {
            Edge curr=pq.remove();
            if (!vis[curr.dest]) {
                vis[curr.dest]=true;
                fianlcost+=curr.cost;

                for(int i=0;i<citites[curr.dest].length;i++){
                    if (citites[curr.dest][i]!=0) {
                        pq.add(new Edge(i, citites[curr.dest][i]));
                    }
                }
            }
        }
     return fianlcost;
    }
    public static void main(String[] args) {
        int citites[][]={{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,0}};
        System.out.println(connectingCities(citites));
    }
}
