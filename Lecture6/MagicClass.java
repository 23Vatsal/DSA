package Lecture6;
import java.util.*;

public class MagicClass {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int count=0;
        int i=1;
        while(N!=0){
            if((N&1)==1) {
                count += Math.pow(5,i);
            }
            i++;
            N=N>>1;
        }
        System.out.println(count);
    }
}
