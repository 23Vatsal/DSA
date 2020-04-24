package Lecture26;

import java.util.Arrays;

public class GenericBST<T extends Comparable<T>> {

    private Node root;
    public class Node{
        T value;
        int height;
        Node left;
        Node right;
        public Node(T value){
            this.value=value;
        }
    }
    public void insert(T key){
       this.root= insert(root,key);
    }
    private Node insert(Node node,T key){
        if(node==null){
            return new Node(key);
        }
        if((node.value).compareTo(key)>0){
            node.left=insert(node.left,key);
        }
        else{
            node.right=insert(node.right,key);
        }
        node.height=Math.max(height(node.left), height(node.right))+1;
        return node;
    }

    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null)
            return;
        String str = "";

        if (node.left != null) {
            str += node.left.value;
        } else {
            str += "END";
        }

        str += " => " + node.value + " <= ";

        if (node.right != null) {
            str += node.right.value;
        } else {
            str += "END";
        }

        System.out.println(str);

        this.display(node.left);
        this.display(node.right);
    }

        //preorder hai ye.
        //for post order sout ko beech me likh do.

    public void sorted(){
        sorted(root);
    }
    //sorted means print in inorder
    private void sorted(Node node){
        if(node==null)
            return;
        sorted(node.left);
        System.out.printf("%d ",node.value);
        sorted(node.right);
    }
    public T successor(T key){
        Node success=null;
        Node current=root;
       return successor(success,current,key);
    }
    private T successor(Node success,Node current,T key){
        while(current!=null){
            if((current.value).compareTo(key)>0) {
                if (success == null || (success.value).compareTo(current.value)>0) {
                    success = current;

                }
                current = current.left;
            }
                else{
                    current=current.right;
                }
            }
        return success.value;
    }
   /* public void inrange(Node node,T k1,T k2){

        if(node.value>k1){

        }
        if(node.value<k2){
            
        }
    }*/
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node==null){
            return 0;
        }
        return node.height;
    }
    public void makeFromSorted(T ar[],int start,int end){
        if(start>end)
            return;
        int mid=(start+end)/2;
        insert(ar[mid]);
        makeFromSorted(ar,start,mid-1);
        makeFromSorted(ar,mid+1,end);
    }
    /*public void makefromPreIn(T[] pre,T[] in){
        this.root=makefromPreIn(root,pre,in);
    }

    private Node makefromPreIn(Node node, T[] pre, T[] in) {
        if(in.length==0){
            return node;
        }
        T ele=pre[0];
        T index=find(ele,in);
        T[] in_left=Arrays.copyOfRange(in,0,index);
        T[] in_right=Arrays.copyOfRange(in,index+1,in.length);
        T[] pre_left= Arrays.copyOfRange(pre,1,index+1);//to wala part exclusive hota hai
        T[] pre_right=Arrays.copyOfRange(pre,index+1,pre.length);
        node=new Node(ele);
        node.left=makefromPreIn(node.left,pre_left,in_left);
        node.right=makefromPreIn(node.right,pre_right,in_right);
        return node;
    }*/
    public int find(int ele,int[] in){
        int index=0;
        for(int i=0;i<in.length;i++){
            if(in[i]==ele) {
                index = i;
                break;
            }

        }
        return index;
    }
    //not working correctly
    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        int balancefactor=Math.abs(height(node.left)-height(node.right));
        if(balancefactor>1)
            return false;
        boolean left=isBalanced(node.left);
        boolean right=isBalanced(node.right);
        return left && right;

    }
    /*public void makeFromPostIn(int[] post,int[] in){
        this.root=makeFromPostIn(root,post,in);
    }

    private Node makeFromPostIn(Node node, int[] post, int[] in) {
        if(in.length==0){
            return null;
        }
        int root=post[post.length-1];
        int index=find(root,in);
        int[] in_left=Arrays.copyOfRange(in,0,index);
        int[] in_right=Arrays.copyOfRange(in,index+1,in.length);
        int[] post_left=Arrays.copyOfRange(post,0,index);
        int[] post_right=Arrays.copyOfRange(post,index,post.length-1);
        Node node1=new Node(root);
        node1.left=makeFromPostIn(node1.left,post_left,in_left);
        node1.right=makeFromPostIn(node1.right,post_right,in_right);
        return node1;
    }*/

}
