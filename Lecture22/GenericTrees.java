package Lecture22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTrees {
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
        System.out.println("Enter value for root node: ");
        int value=sc1.nextInt();
        this.root=new Node(value);
        insert(sc1,root);
    }
    public void insert(Scanner sc1,Node node){
        while(true){
            System.out.println("Do you want child of this node?: "+node.value);
            boolean yes=sc1.nextBoolean();
            if(yes){
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
    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent) {
        System.out.println(indent+node.value);
        //System.out.println();
        for(int i=0;i<node.children.size();i++)
            display(node.children.get(i),indent+"\t");
    }
    public int count(){
        return count(root);
    }
    private int count(Node node){
        int cnt=1;
        for (int i = 0; i < node.children.size() ; i++) {

            cnt+=count(node.children.get(i));

        }
        return  cnt;
    }
    public int max(){
        int max=root.value;
       return max(root,max);
    }

    private int max(Node node, int max) {
        if(max<node.value){
            max=node.value;
        }
        for(int i=0;i<node.children.size();i++){
            max=max(node.children.get(i),max);
        }
        return max;
    }
    public void levelOrder(){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp=queue.remove();
            System.out.println(temp.value);
            for(int i=0;i<temp.children.size();i++)
                queue.add(temp.children.get(i));
        }
    }
    public void atLevel(int k){
        atLevel(root,k);

    }
    public void atLevel(Node node,int k){
        if(k==0){
            System.out.println(node.value);
        }
        for (int i = 0; i <node.children.size() ; i++) {
            atLevel(node.children.get(i),k-1);

        }

    }
}
