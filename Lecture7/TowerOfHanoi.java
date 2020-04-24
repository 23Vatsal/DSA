package Lecture7;

import java.util.*;
public class TowerOfHanoi {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        hanoi(N,"T1","T2","T3");
        System.out.printf("%d", (int)(Math.pow(2,N)-1));//for finding number of moves.
        //number of function calls are Math.pow(2,N-1)
    }
    public static void hanoi(int N, String from_tower,String to_tower,String aux_tower){
        if(N==1){
            System.out.printf("Move 1th disc from %s to %s\n",from_tower,to_tower);
            return;

        }
        hanoi(N-1,from_tower,aux_tower,to_tower);
        System.out.printf("Move %dth disc from %s to %s\n",N,from_tower,to_tower);
        hanoi(N-1,aux_tower,to_tower,from_tower);

    }
}

