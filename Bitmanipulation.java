public class Bitmanipulation {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("given number is even");
        }else{
            System.out.println("given number is odd");
        }
    }
    public static int getBit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        return 1;
    }
    public static int setBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int updateBit(int n,int i,int newBit){
        if(newBit==0){
            return clearBit(n, i);
        }
        return setBit(n, i);
    }
    public static boolean ispowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
             ans=ans*a;
            }
            a=a*a;
           n= n>>1;
        }
        return ans;

    }
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    
    }
    




    public static void main(String[]args){
       oddOrEven(3);
       oddOrEven(6);

      System.out.println( getBit(2, 1));
      System.out.println(setBit(10, 2));
      System.out.println(clearBit(10, 1));
      System.out.println(ispowerOfTwo(3));
      System.out.println(fastExpo(2, 2));
      System.out.println(countSetBits(10));
    }
}