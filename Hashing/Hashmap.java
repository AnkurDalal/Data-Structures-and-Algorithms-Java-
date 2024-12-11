package Hashing;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();

        //put
        hm.put("tea", 10);
        hm.put("samosa", 20);
        hm.put("pizza", 80);
        hm.put("burger", 50);
        hm.put("choclate", 40);

       /*  System.out.println(hm);

        //get
        int price=hm.get("pizza");
        System.out.println(price);
        System.out.println("price of tea="+hm.get("tea"));

        //containsKey
        System.out.println(hm.containsKey("burger"));
        System.out.println(hm.containsKey("idli"));

        //remove
        hm.remove("pizza");
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //is Empty
        System.out.println(hm.isEmpty());*/

        //iteration
     Set<String>keys=hm.keySet();
     System.out.println(keys);

     for (String k : keys) {
        System.out.println("key="+k+","+"value="+hm.get(k));
     }
    }

}
