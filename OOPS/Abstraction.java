package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Chicken smal=new Chicken();
      
    }
}
 abstract class Animals{
   Animals(){
    System.out.println("animals constructor is called");
  }
    void eats(){
        System.out.println("animals eats");
    }
  abstract void walk();
}
class Horse extends Animals{
  Horse(){
    System.out.println("horse constructor is called");
  }
  void walk(){
    System.out.println("walks on four legs");
  }
}
class Chicken extends Animals{
  Chicken(){
    System.out.println("chicken constructor is called");
  }
  void walk(){
    System.out.println("walks on two legs");
  }
}