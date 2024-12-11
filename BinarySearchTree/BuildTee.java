package BinarySearchTree;
import java.util.*;
public class BuildTee {
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
    public static Node insert(Node root,int val){
            if (root==null) {
                root=new Node(val);
                return root;
            }
        //left subtree
        if (val<root.data) {
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
         return root;
    }
    public static void inOrder(Node root){
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean search(Node root,int key){
        if (root==null) {
            return false;
        }
        if (root.data==key) {
            return  true;
        }
        if (key<root.data) {
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }

    }
    //delete node from BST
    public static Node delete(Node root,int val){
        if (val<root.data) {
            root.left=delete(root.left, val);
        }else if (val>root.data) {
            root.right=delete(root.right, val);
        }else{
            //case 1;
            if (root.left==null && root.right==null) {
                return null;
            }
            if (root.left==null) {
                return root.right;
            }else if (root.right==null) {
                return root.left;
            }
         Node IS = findInorderSuccessor(root.right);
         root.data=IS.data;
         root.right=delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
                while (root.left!=null) {
                    root=root.left;
                }
        return root;
    }
    //print In Range
    public static void printInRange(Node root,int k1,int k2){
        if (root==null) {
            return;
        }
        if (root.data>=k1 && root.data<=k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if (root.data<k1) {
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }
    //root to leaf paths
    public static void printRoot2Leaf(Node root,ArrayList<Integer>path){
        if (root==null) {
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right==null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    //check valid bst or not
    public static boolean isValid(Node root,Node min,Node max){
        if (root==null) {
           return true; 
        }
        if (min!=null && root.data<=min.data) {
            return false;
        }
        else if (max!=null && root.data>=max.data) {
            return false;
        }
     return   isValid(root.left, null, root)
       && isValid(root.right,root,max);

    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
    inOrder(root);
    System.out.println();

     //delete(root, 4);
    // inOrder(root);

    // printInRange(root, 5, 12);
    printRoot2Leaf(root, new ArrayList<>());

    if (isValid(root, null, null)) {
        System.out.println("valid bst");
    }else{
        System.out.println("invalid bst");
    }

   
    }
}