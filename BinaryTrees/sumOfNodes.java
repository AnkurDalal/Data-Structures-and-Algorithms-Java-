package BinaryTrees;

public class sumOfNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int sumNodes(Node root){
        if (root==null) {
            return 0;
        }
        int leftSum=sumNodes(root.left);
        int rightSum=sumNodes(root.right);
        int treeSum=leftSum+rightSum+root.data;
        return treeSum;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(6);
    
        System.out.println("summ of all nodes of tree="+sumNodes(root));;
    }
}
