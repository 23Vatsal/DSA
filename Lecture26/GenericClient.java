package Lecture26;

public class GenericClient {
    public static void main(String[] args) {
        GenericBST<String> bst=new GenericBST<String>();
        bst.insert("F");
        bst.insert("B");
        bst.insert("R");
        bst.insert("D");
        bst.display();
    }
}
