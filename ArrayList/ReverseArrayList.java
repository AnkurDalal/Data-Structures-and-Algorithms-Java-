package ArrayList;
import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //print reverse of a arraylist
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
