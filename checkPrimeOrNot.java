import java.util.*;

public class checkPrimeOrNot {
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number u want to check is it prime or not: ");
    int n=sc.nextInt();


    boolean isPrime=true;
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            isPrime=false;
        }
    }
    if(isPrime==true){
        System.out.println("the entered number is prime");
    }else{
        System.out.println("the entered number is not prime");
    }
    
   
 }
    
}
    

