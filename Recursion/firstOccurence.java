package Recursion;

public class firstOccurence {
    public static int firstOcc(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
    if(arr[i]==key){
        return i;
    }
    return firstOcc(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={9,6,5,4,3,2,8,8};
        int key=2;
        System.out.println(firstOcc(arr, 0, key));
    }
}
