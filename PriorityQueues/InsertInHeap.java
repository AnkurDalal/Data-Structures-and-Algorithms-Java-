 package PriorityQueues;
import java.util.*;
public class InsertInHeap {

    static class Heap{
      ArrayList<Integer>arr=new ArrayList<>();
      //add at last index
      public void add(int data){
        arr.add(data);
        
        //fix heap
        int x=arr.size()-1;//child index
        int parent=(x-1)/2;//parent index

       //swap
       while (arr.get(x)<arr.get(parent)) {
             int temp=arr.get(x);
             arr.set(x, arr.get(parent));
             arr.set(parent, temp);

             x=parent;
             parent=(x-1)/2;
       }
      }
      //peek 
      public int peek(){
         return arr.get(0);
      }
      private void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;

        if (left<arr.size()&&arr.get(minIdx)>arr.get(left)) {
          minIdx=left;
        }
        if (right<arr.size()&&arr.get(minIdx)>arr.get(right)) {
          minIdx=right;
        }
        if (minIdx!=i) {
          //swap
          int temp=arr.get(i);
          arr.set(i,arr.get(minIdx));
          arr.set(minIdx,temp);

          heapify(minIdx);
        }
      }
      //remove
      public int remove(){
        int data=arr.get(0);

        //step 1->swap first and last index
        int temp=arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1,temp);

        //step2->remove last index
        arr.remove(arr.size()-1);

        //step 3 heapify
        heapify(0);
        return data;

      }
      public boolean isEmpty(){
         return arr.size()==0;
      }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
          System.out.print(h.peek()+" ");
          h.remove();
        }
    }
    
}