package Lecture27;

public class HashClient {
    public static void main(String[] args) {
        HashmapLL map=new HashmapLL();
        map.put("A","Apple");
        map.put("B","Bat");
        map.put("C","Cat");
        /*System.out.println(map.get("B"));*/
        map.remove("B");
        System.out.println(map.toString());
    }
}
