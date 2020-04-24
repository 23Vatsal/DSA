package Lecture7;

import java.util.Scanner;

//import static jdk.nashorn.internal.objects.NativeArray.push;

public class StackMain {
    public static void main(String[] args) throws Exception {
        Stack1 s=new Stack1();
        Scanner sc1=new Scanner(System.in);
        while(true){
            System.out.println("\nEnter choice 1.)push 2.)pop 3.)exit");
            int N=sc1.nextInt();
            if(N==1){
                System.out.println("Enter element to be pushed:");
                int element=sc1.nextInt();
                s.push(element);
                System.out.println("Stack is: ");
                for(int i=0;i<=s.top;i++){
                    System.out.printf("%d ",s.data[i]);
                }
            }

           else if (N == 2) {

                    System.out.println("Element popped is: " + s.pop());
                    System.out.println("Stack is: ");
                    for (int i = 0; i <= s.top; i++) {
                        System.out.printf("%d ", s.data[i]);
                    }

            }

           else if(N==3)
               break;

        }


    }
}
