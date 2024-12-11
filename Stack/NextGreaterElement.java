package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={8,6,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nextGreater[]=new int[arr.length];
    
        for(int i=arr.length-1;i>=0;i--){
            //step1=while loop
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }

            //step2=if-else condition
        if (s.isEmpty()) {
            nextGreater[i]=-1;
        }else{
            nextGreater[i]=arr[s.peek()];
        }

            //step3=push element
            s.push(i);
        }
    for(int i=0;i<nextGreater.length;i++){
        System.out.print(nextGreater[i]+" ");
    }
    System.out.println();
    }
}
