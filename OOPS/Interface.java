package OOPS;

public class Interface {
    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.moves();
        
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
System.out.println("left,right,up,down,digonal(in all 4 directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,down");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,down,digonal(in all 4 directions");
    }

}