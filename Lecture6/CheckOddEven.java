package Lecture6;

import java.util.*;
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
int N=sc1.nextInt();
check(N);
}
public static void check(int N){
    if((N&1)==1)
        System.out.println("Odd");
else
        System.out.println("even");
}
}