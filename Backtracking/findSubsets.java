package Backtracking;

public class findSubsets {
    public static void subSets(String str,String ans,int idx){
        //base case
    if(idx==str.length()){
         if(ans.length()==0){
            System.out.println("null");
         }else{
            System.out.println(ans);
         }
    return;
    }
        //recursion
        //yes choice:
        subSets(str, ans+str.charAt(idx), idx+1);
        //no choice:
        subSets(str, ans, idx+1);
    }
    public static void main(String[] args) {
        String str="abc";
        subSets(str, "", 0);
    }
}
