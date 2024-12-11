package Hashing;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(4);
        set.add(3);

      /*  Iterator i=set.iterator();
       while (i.hasNext()) {
        System.out.println(i.next());
       }*/
      for(int i:set){
        System.out.println(i);
      }

       /*  System.out.println(set);


        if (set.contains(4)) {
            System.out.println("set contains 4");
        }
        if (set.contains(5)) {
            System.out.println("set contains 5");
        }

        set.remove(4);
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());*/
    }
}
