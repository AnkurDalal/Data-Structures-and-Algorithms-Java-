package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
    Deer d1=new Deer();
    d1.eats();
        
    }
}
class Calculator{
 int sum(int a,int b){
   return a+b;
 }
 float sum(float a,float b){
    return a+b;
 }
 int sum(int a,int b,int c){
    return a+b+c;
 }
}
class Animal{
    void eats(){
        System.out.println("eats any thing");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}