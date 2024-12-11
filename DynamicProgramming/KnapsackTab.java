package DynamicProgramming;

public class KnapsackTab {
    public static int knapSackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        // No need to explicitly initialize dp[0][0] to dp[n][0] because they are already 0
        // due to default initialization of int arrays in Java.

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    // Either take the item or don't take it
                    int incProfit = v + dp[i - 1][j - w];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    // If the item can't be included, just carry forward the previous result
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int wt[] = {15, 14, 10, 45, 30};
        int val[] = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println(knapSackTab(val, wt, W));
    }
}
