package BinaryTrees;

import GreedyAlgorithms.MaxLengthChainPairs;

public class DiameterOfTree {
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
    public static int height(Node root){
        if (root==null) {
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int selfHeight=leftHeight+rightHeight+1;
        return selfHeight;
    }
    public static int diameterOfTree(Node root){
        if (root==null) {
            return 0;
        }
        int leftDia=diameterOfTree(root.left);
        int leftHt=height(root.left);
        int rightDia=diameterOfTree(root.right);
        int rightHt=height(root.right);

        int selfDia=leftHt+rightHt+1;

        return Math.max(selfDia, Math.max(rightDia, leftDia));
    }
    static class Info {
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
        
    }
    public static Info diameterOptimised(Node root){
        if (root==null) {
            return new Info(0, 0);
        }
       Info leftInfo=diameterOptimised(root.left);
       Info rightInfo=diameterOptimised(root.right);
       int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
       int ht=Math.max(leftInfo.ht, rightInfo.ht);

       return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        System.out.println(diameterOptimised(root).diam);
    }
}
