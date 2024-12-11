package DynamicProgramming;

public class RodCutting {
    public static int rodCutting(int length[],int price[],int rodLength){
        int n=price.length;
        int dp[][]=new int[n+1][rodLength+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<rodLength+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                  
                
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodLength+1;j++){
                if (length[i-1]<=j) {
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][rodLength];
    }
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={15,8,10,17,17,20};
        int rodLength=8;
        System.out.println(rodCutting(length, price, rodLength));
    }
}