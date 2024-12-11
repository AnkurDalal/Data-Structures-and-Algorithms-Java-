package BinarySearchTree;


public class MirrorOfBst {
    static class Node {
      int data;
      Node left;
      Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
     public static Node createMirrorr(Node root){
        if (root==null) {
            return null;
        }
        Node leftMirror=createMirrorr(root.left);
        Node rightMiorrror=createMirrorr(root.right);

        root.left=rightMiorrror;
        root.right=leftMirror;

        return root;
     }   
    
    public static void preOrder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(10);
        root.right.right=new Node(11);

    root=createMirrorr(root);
    preOrder(root);
        
    }
}
