package ArrayList;
import java.util.ArrayList;
public class operationONArrayList {
    public static void main(String[] args) {
      ArrayList<Integer>list=new ArrayList<>();
      //add
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      System.out.println(list);  

    //get element
  //  int element=list.get(3);
   // System.out.println(element);

    //remove element
   // list.remove(2);
    //System.out.println(list);

    //set element
    list.set(2, 6);
    System.out.println(list);

    //contains element
    //System.out.println(list.contains(6));
    //System.out.println(list.contains(11));

    System.out.println(list.size());
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
    System.out.println();
    }
}
