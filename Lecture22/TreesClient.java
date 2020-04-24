package Lecture22;

import java.util.Scanner;

public class TreesClient {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        GenericTrees gt=new GenericTrees();
        gt.insert(sc1);
        //gt.display();
        System.out.println("Number of nodes are: " +gt.count());
        //System.out.println("Max. value in tree is: " +gt.max());
        //gt.levelOrder();
        gt.atLevel(2);
    }
}
