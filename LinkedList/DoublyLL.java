 package LinkedList;

 public class DoublyLL {
    public class Node {
       int data;
       Node next;
       Node prev;
       public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
       }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add
    public void add(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //remove
    public int remove(){
        if (head==null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if (size==1) {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    //print
    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"<-->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    //reverse doubly LinkedList
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;//
            prev=curr;
            curr=next;
        }
        head=prev;
    }
   public static void main(String[] args) {
    DoublyLL dll=new DoublyLL();
    dll.add(3);
    dll.add(2);
    dll.add(1);
    dll.print();
    dll.reverse();
    dll.print();
    System.out.println(dll.size);
   }
    
}