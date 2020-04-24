package Lecture31;

public class DiceCount {
    public static void main(String[] args) {
        int n=7;
        int[] mem=new int[n+1];
        System.out.println(dice(7));
        System.out.println(diceDP(n,mem));
        System.out.println(diceIter(n,mem));
    }

    private static int diceDP(int target, int[] mem) {
        if(target==0){
            return 1;
        }
        //jo cheez change hoti hai usko rakhte hai yahan pe
        if(mem[target]!=0){
            return mem[target];
        }
        int cnt=0;
        for (int i = 1; i <=6 && i<=target; i++) {
            cnt+=diceDP(target-i,mem);
        }
        mem[target]=cnt;

        return mem[target];
    }

    public static int dice(int target){
        if(target==0){
           return 1;
        }
        int count=0;
        for (int i = 1; i <=6 && i<=target; i++) {
            count+=dice(target-i);
        }

        return count;
    }
    private static int diceIter(int target,int[] mem){
        mem[0]=1;
        for (int i = 1; i <=target ; i++) {
            for (int j = 1; j <=i && j<=6 ; j++) {
                mem[i]=mem[i]+mem[i-j];
            }
        }
        return mem[target];
    }
}
