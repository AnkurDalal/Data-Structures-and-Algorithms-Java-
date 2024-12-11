package DynamicProgramming;
import java.util.*;

public class CatalansNumber {
    public static int catalanRec(int n){
        if (n==0||n==1) {
            return 1;
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=catalanRec(i)*catalanRec(n-1-i);
        }
        return ans;
    }
    public static int catalanMemo(int n,int dp[]){
        if(n==0||n==1){
            return 1;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
ans+=catalanMemo(i, dp)*catalanMemo(n-i-1, dp);

        }
        return dp[n]=ans;
    }
    public static void main(String[] args) {
         int n=4;
       
       int dp[]=new int[n+1];
      Arrays.fill(dp,-1);
       System.out.println(catalanMemo(n,dp));
    }
}
