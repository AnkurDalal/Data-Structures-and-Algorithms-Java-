package Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static int largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
        }
        return largest;
    }
       public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found at "+"("+i+","+j+")");
                }
            }
        }
        return false;
       }
       public static void main(String[]args){
    
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
       int n=3;
       int m=3;
        for(int i=0;i<n;i++){//rows
            for(int j=0;j<m;j++){//columns
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
        System.out.println();
        }
        search(matrix, 6);
        System.out.println(largest(matrix));
       }   
        
}