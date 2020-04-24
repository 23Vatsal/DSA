package Lecture31;

public class Mazepath {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int[][] mem=new int[row+1][col+1];
        System.out.println(mazepath(row,col));
        System.out.println(mazepathIter(row,col,mem));

    }
    private static int mazepath(int row,int col){
        if(row==1 || col==1){
            return 1;
        }

            return mazepath(row-1,col)+ mazepath(row,col-1);

    }
    public static int mazepathDP(int row,int col,int[][] mem){
        if(row==1 || col==1){
            return 1;
        }
        if(mem[row][col]!=0)
            return mem[row][col];
        mem[row][col]=mazepathDP(row-1,col,mem);
        mem[row][col]=mazepathDP(row,col-1,mem);
        return mem[row][col];
    }
    private static int mazepathIter(int row,int col,int[][] mem){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i==1 || j==1){
                    mem[i][j]=1;
                }
                else{
                    mem[i][j]=mem[i-1][j]+mem[i][j-1];
                }

            }


        }
        return mem[row][col];
    }

}
