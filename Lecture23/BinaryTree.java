package Lecture23;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public class Node{
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value=value;
        }
    }
    public void insert(Scanner sc1){
        this.root=insert(root,sc1);
    }
    private Node insert(Node node, Scanner sc1){
        if(node==null){
            System.out.println("Enter a value:");
            int val=sc1.nextInt();
            return new Node(val);
        }
        System.out.println("Enter the direction: ");
        String dir=sc1.next();
        if(dir.equals("left")){
            node.left=insert(node.left,sc1);
        }
        else
            node.right=insert(node.right,sc1);

        return node;
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
        if(node==null)
            return;
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");

        //preorder hai ye.
        //for post order sout ko beech me likh do.

    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node==null)
            return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }

    public boolean find(int target){
        return find(root,target);
    }

    private boolean find(Node node, int target) {
        if(node==null)
            return false;
        if(node.value==target)
            return true;
        return find(node.left,target) || find(node.right,target);

    }
    public int diameter(){
        return diameter(root);
    }
    private int diameter(Node node) {
        if(node==null)
            return 0;
        int current=1+height(node.left)+height(node.right);
        int max=Math.max(diameter(node.left),diameter(node.right));

        return Math.max(max,current);

    }
    public void mirror(){
        mirror(root);
    }
    private void mirror(Node node){
        if(node==null)
            return;

        //for swapping
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
        mirror(node.left);
        mirror(node.right);
    }
}
