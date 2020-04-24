package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RightViewTree {
    public static class Right{
        static Scanner sc1=new Scanner(System.in);
        private Node root;
        public class Node{
            int data;
            Node left;
            Node right;
            public Node(int data){
                this.data=data;
            }
        }
        public void createTree(){
            this.root=createTree(root);
        }

        private Node createTree(Node node) {
            int x=sc1.nextInt();
            Queue<Node> q= new LinkedList<>();
            node=new Node(x);
            this.root=node;
            q.add(root);
            while(!q.isEmpty()){
                int c1=sc1.nextInt();
                int c2=sc1.nextInt();
                Node tempNode=q.poll();
                if(c1!=-1){
                    node=new Node(c1);
                    tempNode.left=node;
                    q.add(tempNode.left);
                }
                if(c2!=-1){
                    node=new Node(c2);
                    tempNode.right=node;
                    q.add(tempNode.right);
                }
            }
            return root;
        }
        public void rightView(){
            rightView(root);
        }

        private void rightView(Node node) {
            if(node==null)
                return;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int n=q.size();
                for (int i = 1; i <=n ; i++) {
                    Node tempNode=q.poll();
                    if(i==n)
                        System.out.printf("%d ",tempNode.data);
                    if(tempNode.left!=null){
                        q.add(tempNode.left);
                    }
                    if(tempNode.right!=null){
                        q.add(tempNode.right);
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Right rt=new Right();
        rt.createTree();
        rt.rightView();
    }
}
