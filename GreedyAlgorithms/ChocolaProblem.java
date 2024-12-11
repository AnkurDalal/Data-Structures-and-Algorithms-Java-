package GreedyAlgorithms;
import java.util.*;
public class ChocolaProblem {
    public static void main(String[] args) {
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        //sort on basis of cost
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        //variables
        int h=0,v=0;
        int hp=0,vp=0;
        int cost=0;

        while (h<costHor.length && v<costVer.length) {
            if(costVer[v]<=costHor[h]){//horizontal cut
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(costVer[v]*hp);//vertical cut
                vp++;
                v++;
        }
    }
    while (h<costHor.length) {
        cost+=(costHor[h]*vp);
        hp++;
        h++;
    }
    while (v<costVer.length) {
        cost+=(costVer[v]*hp);
                vp++;
                v++;
    }
    System.out.println("min cost of cuts="+cost);
}
}
