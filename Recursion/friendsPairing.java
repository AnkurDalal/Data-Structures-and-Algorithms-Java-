package Recursion;

public class friendsPairing {
    public static int pairing(int n){
        if(n==1||n==2){
            return n;
        }
        //kaam
        //single
        int fnm1=pairing(n-1);
        //pair choice
        int fnm2=pairing(n-2);
        int pairWays=(n-1)*fnm2;
        //totalWays:
        int totalWays=fnm1+pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
    
}
