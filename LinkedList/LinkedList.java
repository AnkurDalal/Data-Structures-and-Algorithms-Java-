 package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
public static Node head;
public static Node tail;
public static int size;
        //add first in a LinkedList
        public void addFirst(int data){
            //step1=create a newNode
            Node newNode=new Node(data);
            size++;
            if (head==null) {
                head=tail=newNode;
                return;
            }
            //step2=newNode.next=head;
            newNode.next=head;
            //step3=head=newNode
            head=newNode;
        }
    //add last in a LinkedList
    public void addLast(int data){
        //step1=create a new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2=tail.next=newNode
        tail.next=newNode;
        //step3=tail=newNode
        tail=newNode;
    }
    //print a LinkedList
    public void print(){
        //step1=store the value of head node in temp node
        if(head==null){
           System.err.println("ll is empty");
           return;
        }
        Node temp=head;
        while (temp!=null) {
           //step2=print temp data
        System.out.print(temp.data+"-->");
        //step3=temp=temp.next;
        temp=temp.next; 
        }
        System.out.println("null");
    }
    //add in middle of a LinkedList
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //remove first in a LinkedList
    public int removeFirst(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    //remove last in a LinkedList
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
    //find the prev node
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;  
    }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
    }

    //iterative search on LinkedList
  public int itrSearch(int key){
    Node temp=head;
    int i=0;
    while (temp!=null) {
        if(temp.data==key){
            return i;
        }
    temp=temp.next;
    i++;
    }
    return -1;
  }

  //recursive search on the LinkedList
  public int helperFunction(Node head,int key){
    //base case
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    //kaam
    int idx=helperFunction(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
  }
  public int recSearch(int key){
      return helperFunction(head, key);
  }

  //reverse a LinkedList
  public void reverese(){
    Node prev=null;
    Node curr=tail=head;
    Node next;

    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
  }

  //delete Nth from End in LinkedList
  public void deleteNthFromEnd(int n){
    //cal size
    int size=0;
    Node temp=head;
    while (temp!=null) {
        temp=temp.next;
        size++;
    }
    //if we want to delete head node
    if(n==size){
        head=head.next;
        return;
    }
    int i=1;
    int idxToFind=size-n;
    Node prev=head;
    while (i<idxToFind) {
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
  }
  //check if a LinkedList is palindrome or not

//slow fast approach
public Node findMid(Node head){
    Node slow=head;
    Node fast=head;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;//+1
        fast=fast.next.next;//+2
    }
    return slow;//slow is my mid node;
}
public boolean checkPalindrome(){
    if(head==null ||head.next==null){
        return true;
    }
    //step1=find the mid Node
    Node midNode=findMid(head);

    //step2=reverse your second half
    Node prev=null;
    Node curr=midNode;
    Node next;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right=prev;//right half ka head
    Node left=head;
    //step3=check left half=right half
    while (right!=null) {
        if (left.data!=right.data) {
            return false;
        }
        left=left.next;
        right=right.next;
    }
   
    return true;
    
}
//cycle detection in LinkedList
public boolean isCycle(){
    Node slow=head;
    Node fast=head;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast) {
            return true;//cycle exsists
        }
    }
    return false;//cycle does not exsists
}
//remove cycle in a LinkedList
public void removeCycle(){
    //step1=detect cycle
Node slow=head;
Node fast=head;
boolean cycle=false;
while (fast!=null && fast.next!=null) {
    slow=slow.next;
    fast=fast.next.next;
    if (slow==fast) {
        cycle=true;
        break;
    }
    if (cycle==false) {
        return;
    }
}
    //step2=find the metting point
    slow=head;
    Node prev=null;
    while (slow!=fast) {
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }

    //step3=prev node.next=null
    prev.next=null;
}
//merge sort on LinkedList
public Node getMid(Node head){
  Node slow=head;
  Node fast=head.next;
  while (fast!=null && fast.next!=null) {
    slow=slow.next;
    fast=fast.next.next;
  }
  return slow;//mid node 
}
public Node merge(Node head1,Node head2){
    Node mergedLL=new Node(-1);
    Node temp=mergedLL;

    while (head1!=null && head2!=null) {
        if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }
        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    
    return mergedLL.next;
}
public Node mergeSort(Node head){
    if(head==null || head.next==null){
        return head;
    }
    //step1=find the mid node
   Node mid=getMid(head);
    //step2=left and right MS
  Node rightHead=mid.next;
  mid.next=null;
 Node newLeft= mergeSort(head);
 Node newRight=mergeSort(rightHead);
  
 //step3=merge left half and right half
  return merge(newLeft,newRight);
}
//zig-zag LinkedList
public void zigZag(){
    //step1=find the mid node
    Node slow=head;
    Node fast=head.next;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    //step2=reverse second half
     Node curr=mid.next;
     mid.next=null;
     Node prev=null;
     Node next;
     while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
     }
    Node left=head;
    Node right=prev;
    Node nextL;Node nextR;
    //step3=alternate merging
    while (left!=null && right!=null) {
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;
    }
}
   public static void main(String[] args) {
    LinkedList ll=new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);

    ll.print();
    ll.zigZag();
    ll.print();
   

   }
}