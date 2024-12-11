package Recursion;

public class tillingProblem {
    public static int tillingProb(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
    //vertical choice
    int vertical=tillingProb(n-1);
    int horizontal=tillingProb(n-2);
    int totalWays=vertical+horizontal;
    return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tillingProb(3));
    }
}
