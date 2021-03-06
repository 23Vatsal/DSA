package Lecture31;

public class LCS {
    public static void main(String[] args) {
        String s1="abed";
        String s2="abded";
        int[][] mem =new int[s1.length()+1][s2.length()+1];
        System.out.println(lcssol(s1,s2));
        System.out.println(lcsIter(s1,s2,mem));

    }
    public static int lcssol(String s1, String s2){
        if(s1.length()==0 || s2.length()==0){
            return 0;
        }
        char ch=s1.charAt(0);
        char ch1=s2.charAt(0);
        if(ch==ch1){
            return 1+ lcssol(s1.substring(1),s2.substring(1));
        }
        else{
            return Math.max(lcssol(s1.substring(1),s2), lcssol(s1,s2.substring(1)));
        }

    }
    public static int lcsIter(String s1,String s2,int[][] mem){
        for (int i = 0; i <=s1.length() ; i++) {
            for (int j = 0; j <=s2.length() ; j++) {
                if(i==0 || j==0)
                    mem[i][j]=0;
                else{
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        mem[i][j]=1+mem[i-1][j-1];
                    }
                    else{
                        mem[i][j]=Math.max(mem[i-1][j],mem[i][j-1]);
                    }
                }

            }

        }
        return mem[s1.length()][s2.length()];
    }
}
