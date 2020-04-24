package Lecture28;

public class HashArrayClient {
    public static void main(String[] args) {
        HashMapArray hmarr=new HashMapArray();
        hmarr.push("A","Apple");
        hmarr.push("B","Bat");
        hmarr.push("C","Cat");
        hmarr.push("D","Dog");
        System.out.println(hmarr.get("A"));
        System.out.println(hmarr.get("B"));

    }
}
