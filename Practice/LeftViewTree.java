package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeftViewTree {
    public static class LeftBinary {
        static Scanner sc1 = new Scanner(System.in);
        private Node root;

        public class Node {
            int data;
            Node left;
            Node right;

            public Node(int data) {
                this.data = data;
            }
        }

        public void createNode() {
            this.root = createNode(root);
        }

        private Node createNode(Node node) {
            int x = sc1.nextInt();
            Queue<Node> q = new LinkedList<>();
            node = new Node(x);
            this.root = node;
            q.add(root);
            while (!q.isEmpty()) {
                Node node1 = q.poll();
                int c1 = sc1.nextInt();
                int c2 = sc1.nextInt();
                if (c1 != -1) {
                    node = new Node(c1);
                    node1.left = node;
                    q.add(node1.left);
                }
                if (c2 != -1) {
                    node = new Node(c2);
                    node1.right = node;
                    q.add(node1.right);
                }
            }
            return root;
        }

        public void display(){
            display(root);
        }
        private void display(Node node){
            if(node==null)
                return;
            String str="";
            if(node.left!=null)
                str+=node.left.data;
            else
                str+="END";
            str+=" => " + node.data + " <= ";
            if(node.right!=null)
                str+=node.right.data;
            else
                str+="END";
            System.out.println(str);
            display(node.left);
            display(node.right);
        }
        public void levelOrder() {
            levelOrder(root);
        }

        private void levelOrder(Node node) {
            if (node == null)
                return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int n = q.size();
                for (int i = 1; i <= n; i++) {
                    Node tempNode = q.poll();
                    if (i == 1)
                        System.out.printf("%d ", tempNode.data);
                    if (tempNode.left != null) {
                        q.add(tempNode.left);
                    }
                    if (tempNode.right != null) {
                        q.add(tempNode.right);
                    }

                }
            }
        }

        public static void main(String[] args) {
            LeftBinary lb = new LeftBinary();
            lb.createNode();
            lb.levelOrder();


        }
    }
}
