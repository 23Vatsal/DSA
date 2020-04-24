package Lecture6;
import java.util.*;

public class CheckSetBits {
    public static void main(String[] args) {
        int n=7;
        count(n);
    }
    public static void count(int n){
        int count=0;
        while(n!=0) {
            if ((n & 1) == 1)
                count++;
           n= n>>1;
        }
        System.out.println(count);
    }
}
