package OOPS;

public class constructors {
    public static void main(String[] args) {
        Student s1=new Student("Ankur Dalal", 21);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        Student s2=new Student();
        Student s3=new Student("Khushi");
        System.out.println(s3.name);
        
    }
}
class Student{
    String name;
    int rollNo;

    Student(){
        System.out.println("constructor is called...");
    }
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    Student(String name){
        this.name=name;
    }
    Student(int rollNo){
        this.rollNo=rollNo;
    }
}

