package Lecture31;

public class FibDP {
    public static void main(String[] args) {
        int n=5;
        Integer[] mem=new Integer[n+1];

        //System.out.println(fibDynamic(n,mem));       System.out.println(fibIter(n,mem));
    }
    public static int fibDynamic(int n,Integer[] mem){
        if(n<2){
            return n;
        }
        if(mem[n]!=null){
            return mem[n];
        }
        mem[n]=fibDynamic(n-1,mem) + fibDynamic(n-2,mem);
        return mem[n];

    }
    public static int fibIter(int n,Integer[] mem){
        mem[0]=0;
        mem[1]=1;
        for (int i = 2; i <=n ; i++) {
            mem[i]=mem[i-1]+mem[i-2];
        }
        return mem[n];
    }
}
