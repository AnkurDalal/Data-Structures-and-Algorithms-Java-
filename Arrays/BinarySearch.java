package Arrays;
public class BinarySearch {
    public static int BinaryS(int arr[],int key){
        int start=0;int end=arr.length-1;
          while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
          }
          return -1;
    }

    public static void main(String[]args){
        int arr[]={1,3,5,7,9,11,13,15,17};
        int key=3;
        System.out.println(BinaryS(arr, key));
    }
}