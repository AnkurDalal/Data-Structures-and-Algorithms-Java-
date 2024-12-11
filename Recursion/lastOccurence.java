package Recursion;

public class lastOccurence {
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
    int isFound= lastOcc(arr, key, i+1);
    if(isFound==-1 && arr[i]==key){
        return i;
    }
    return isFound;
    }
    public static void main(String[] args) {
        int arr[]={9,6,5,4,3,2,8,8};
        int key=8;
        System.out.println(lastOcc(arr, key,0));
    }

}
