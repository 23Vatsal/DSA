package Lecture23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryTreeClient {
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("input");
        Scanner sc1=new Scanner(file);
        BinaryTree bt=new BinaryTree();

        bt.insert(sc1);
        bt.insert(sc1);
        bt.insert(sc1);
        bt.insert(sc1);
        bt.insert(sc1);
        bt.insert(sc1);
        bt.display();
        System.out.println("Height is: "+bt.height());
        System.out.println("Found: "+bt.find(5));
        System.out.println("Diameter is: "+bt.diameter());
        bt.mirror();
        System.out.println("Mirrored tree is:\n");
        bt.display();
    }


}
