package Lecture6;
import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int a[]={4,5,6,4,5};
        xor(a);
    }
    public static void xor(int[] a){
        int x=a[0];
        for(int i=1;i<a.length;i++){
             x=(x^a[i]);
             }
        System.out.println(x);

        }

    }

