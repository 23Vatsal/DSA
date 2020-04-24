package Lecture24;

public class BSTClient {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        //bst.insert(8);
        //bst.insert(9);
        /*int[] ar={1,2,3,4,5,6};
        bst.makeFromSorted(ar,0,ar.length-1);*/
        /*int pre[]={6,8,2,9,1};
        int in[]={2,8,6,1,9};
        int post[]={2,5,3,6,10,12,8};
        bst.makefromPreIn(pre,in);*/
        //bst.makeFromPostIn(post,in);
        bst.display();
       /* System.out.println("Sorted is:");
        bst.sorted();*/
        /*System.out.println();
        System.out.println(bst.successor(7));*/
        System.out.println(bst.isBalanced());
        System.out.println("\nHeight is: "+bst.height());
    }
}
