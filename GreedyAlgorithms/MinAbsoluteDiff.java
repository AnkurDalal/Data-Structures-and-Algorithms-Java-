package GreedyAlgorithms;
import java.util.*;;
public class MinAbsoluteDiff {
    public static void main(String[] args) {
        int A[]={4,1,7,8};
        int B[]={3,5,2,6};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("min absolute diff of pairs="+minDiff);
    }
}
