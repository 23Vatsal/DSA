package Lecture6;
import java.util.*;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();
        int b=sc1.nextInt();
        swap(a,b);
    }
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+ " " +b);
    }
}
