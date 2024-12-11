package Recursion;

public class removeDuplicates {
    public static void removeDup(String str,int idx,StringBuilder newStr, boolean map[]){
        //base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
    //kaam
    char curr=str.charAt(idx);
    if(map[curr-'a']==true){
        removeDup(str, idx+1, newStr, map);
    }else{
        map[curr-'a']=true;
        removeDup(str, idx+1, newStr.append(curr), map);
    }
    }
    public static void main(String[] args) {
        String str="raccecaar";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
