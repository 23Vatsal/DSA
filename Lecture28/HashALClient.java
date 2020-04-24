package Lecture28;

public class HashALClient {
    public static void main(String[] args) {
        HashMapArrayList hmAL=new HashMapArrayList();
        hmAL.put("A","Apple");
        hmAL.put("B","Bat");
        hmAL.put("C","Cat");
        hmAL.put("D","Dog");
        hmAL.put("E","Ele");
        hmAL.remove("B");
        System.out.println(hmAL.get("A"));
        System.out.println(hmAL.get("B"));
        System.out.println(hmAL.get("C"));
        System.out.println(hmAL.get("D"));
        System.out.println(hmAL.get("E"));
    }
}
