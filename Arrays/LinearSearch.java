package Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
        }
        return -1;
    }
public static int linearSearch1(String menu[],String key1){
    for(int i=0;i<menu.length;i++){
        if(menu[i]==key1){
            return i;
        }
    }
    return -1;
}
public static int getLargest(int arr[]){
    int largest=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
     }
     return largest;
}
public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
    }
}
    public static void main(String[]args){
int marks[]={97,98,99};
        update(marks);

    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
    }
    System.out.println();

    int arr[]={1,3,5,7,9,11};
    String menu[]={"cold drink","momos","pasta","maggi"};
    String key1="maggi";
    int key=12;
    int index=linearSearch(arr, 12);
    if(index==-1){
        System.out.println("key not found");
    }else{
        System.out.println("key found at index:"+index);
    }


    int idx=linearSearch1(menu, "maggi");
    if(idx==-1){
        System.out.println("key not found");
    }else{
        System.out.println("key found at index:"+idx);
    }

         System.out.println(getLargest(arr));
    }
}
