package Lecture20;

import org.w3c.dom.Node;

public class LinkedList {
        private Node head=null;
        private Node tail=null;
        int size=0;
        public class Node{
            int value;
            Node next;
            public Node(int value){
                this.value=value;
                this.next=null;
            }
        }

        public void addNode(int data){
            Node newNode=new Node(data);
            //checks list is Empty
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }

        }

        public void display(){
            Node current=head;
            if(head==null)
            {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes are:");
            while(current!=null){
                System.out.printf("%d ",current.value);
                current=current.next;
            }
        }

}
