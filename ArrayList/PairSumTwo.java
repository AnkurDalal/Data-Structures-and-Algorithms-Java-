package ArrayList;
import java.util.ArrayList;

public class PairSumTwo {
    public static boolean pairSum2(ArrayList<Integer>list,int target){
        int n=list.size();
        int bp=-1;
        //finding breaking point 
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while (lp!=rp) {
            //case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if (list.get(lp)+list.get(rp)<target) {
                lp=(lp+1)%n;
            }else{
                rp=(rp+n-1)%n;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list, target));
    }
}

