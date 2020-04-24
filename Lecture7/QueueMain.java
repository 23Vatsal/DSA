package Lecture7;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        CircularQueue q=new CircularQueue();
        while (true) {
            System.out.println("\nEnter choice 1.)insert 2.)remove 3.)exit");
            int N = sc1.nextInt();
            if (N == 1) {
                System.out.println("Enter element to be pushed:");
                int element = sc1.nextInt();
                q.insert(element);
                System.out.println("Queue is: ");
                for (int i = 0; i < q.size; i++) {
                    System.out.printf("%d ", q.data[(q.front+i)%q.data.length]);
                }
            } else if (N == 2) {
                System.out.println("Element removed is: " + q.remove());
                System.out.println("Queue is: ");
                for (int i = 0; i < q.size; i++) {
                    System.out.printf("%d ", q.data[(q.front+i)%q.data.length]);
                }
            } else if (N == 3)
                break;
        }
    }
}
