package DynamicProgramming;

public class fibonacci {
    public static int Fib(int n,int dp[]){
         if (n==0||n==1) {
            return n;
         }
         if (dp[n]!=0) {
            return dp[n];
         }
        dp[n]=Fib(n-1, dp)+Fib(n-2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        System.out.println(Fib(n, dp));
    }
}
