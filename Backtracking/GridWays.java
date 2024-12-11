package Backtracking;

public class GridWays {
    public static int gridWays(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if (i==n ||j==m) {
            return 0;
        }
        //kaam
        int way1=gridWays(i+1, j, n, m);//down move
        int way2=gridWays(i, j+1, n, m);//right move
        int totalWays=way1+way2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=3,m=3;
       System.out.println(gridWays(0, 0, n, m));
    }
}
