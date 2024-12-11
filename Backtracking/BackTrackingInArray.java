package Backtracking;

public class BackTrackingInArray {
    public static void changeArr(int arr[],int idx,int val){
        //base case
    if(idx==arr.length){
        printArr(arr);
        return;
    }
        //recursion
        arr[idx]=val;
        changeArr(arr, idx+1, val+1);
        arr[idx]=arr[idx]-2;//backtracking step
    }
public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
System.out.println();
}
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
