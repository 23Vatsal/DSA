package Lecture25;

public class Heap_Client {
    public static void main(String[] args) throws Exception {
        Heap_one heap=new Heap_one();
        heap.insert(5);
        heap.insert(6);
        heap.insert(3);
        heap.insert(7);
        heap.insert(8);
        for (int i = 0; i < 5; i++) {
            System.out.println(heap.remove());
        }
        heap.display();
    }
}
