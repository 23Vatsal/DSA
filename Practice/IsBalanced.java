package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsBalanced {
    static Scanner scn=new Scanner(System.in);
    public static class BinaryBalanced{
        private Node root;
        public class Node {
            int data;
            Node left;
            Node right;
            public Node(int data){
                this.data=data;
            }
        }
        public void insert(){
            this.root=insert(root);
        }

        private Node insert(Node root) {
            int cdata = scn.nextInt();
            Node child = new Node(cdata);

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.insert(child);
            }
            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.insert(child);
            }
            return child;
        }
        public boolean isBal(){
           return isBal(root);
        }

        private boolean isBal(Node node) {
            //if tree is empty then it is balanced
            if(node==null)
                return true;

            int lh=height(node.left);
            int rh=height(node.right);

            if(Math.abs(lh-rh)>=1 && isBal(node.left) && isBal(node.right))
                return true;

            return false;

        }
        private int height(Node node){
            if(node==null)
                return 0;

            return 1+Math.max(height(node.left),height(node.right));
        }

    }

    public static void main(String[] args) {
        BinaryBalanced bb=new BinaryBalanced();
        bb.insert();
       System.out.println(bb.isBal());

    }
}
