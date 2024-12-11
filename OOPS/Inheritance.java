package OOPS;

public class Inheritance {
    public static void main(String[] args) {
      Dog bully=new Dog();
      bully.color="whitsmoke";
      System.out.println(bully.color);
      Mammal m1=new Mammal();
    m1.reproduce();
    }
}
//base class
class Animal{
    String color;
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    int legs;
    void reproduce(){
        System.out.println("mammal can reproduce");
    }
}
class Dog extends Animal{
      String breed;
      void bark(){
        System.out.println("dogs can bark");
      }
}
//derived class
/*class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims");
    }
}*/
