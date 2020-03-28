package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class TreesPractice {

    private Node root;
    public class Node{
        int value;
        ArrayList<Node> children;
        public Node(int value){
            this.value=value;
            this.children=new ArrayList<>();
        }
    }
    public void insert(Scanner sc1){
        System.out.println("Enter root: ");
        int value=sc1.nextInt();
        this.root=new Node(value);
        insert(sc1,root);
    }
    public void insert(Scanner sc1,Node node){
        while(true){
            System.out.println("Enter 1)Insert 2)exit: ");
            int choice=sc1.nextInt();
            if(choice==1){
                System.out.println("Enter value of child: ");
                int value=sc1.nextInt();
                Node child=new Node(value);
                node.children.add(child);
                insert(sc1,child);
            }
            else{
                break;
            }
        }
    }
}
