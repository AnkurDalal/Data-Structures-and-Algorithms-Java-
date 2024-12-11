package Strings;

import java.util.Scanner;

public class string {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Firstname to see the output:");
        String firstName=sc.next();
        System.out.println("Enter your last name to see the output:");
        String lastName=sc.next();
        String fullName=firstName+" "+lastName;
        

        printLetters(fullName);


        
    }
}
