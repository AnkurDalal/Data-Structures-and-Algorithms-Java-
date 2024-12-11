package OOPS;

public class oops {
    public static void main(String[] args) {
     Pen flair=new Pen();//created the object of pen
     flair.setColor("blue");
     System.out.println(flair.getColor());
     flair.setTip(5);
     System.out.println(flair.getTip());


     BankAccount pnb=new BankAccount();//created object of bank class
     pnb.name="Ankur Dalal";
     System.out.println(pnb.name);
     pnb.Setpassword(946637);
     System.out.println(pnb.getPassword());
     
     
    }
}


 class Pen{
  private  String color;
  private  int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
 }

class BankAccount{
   public String name;
   private int  password;

   int getPassword(){
    return this.password;
   }

   void Setpassword(int newPassword){
    password=newPassword;
   }

}
