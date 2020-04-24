//input char array in form of 'O' and 'X'.
//prints only one sol
import java.util.*;
public class RatInAMaze {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int N=sc1.nextInt();
        int M=sc1.nextInt();
        char[][] maze=new char[N][M];
        int[][] sol=new int[N][M];
        for (int i = 0; i <N ; i++) {
            String s=sc1.next();
            for (int j = 0; j <M ; j++) {
                maze[i][j]=s.charAt(j);
            }
        }
        if(mazeHelp(maze,N,M,sol,0,0))
        {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <M ; j++) {
                    System.out.printf("%d ",sol[i][j]);

                }
                System.out.println();
            }
        }
        else
            System.out.println("NO PATH FOUND");
    }
    public static boolean mazeHelp(char[][] maze,int N, int M,int[][] sol,int x ,int y){
        if(x==N-1 && y==M-1){
            sol[x][y]=1;
            return true;
        }
        if(x>=0 && x<N && y>=0 && y<M && maze[x][y]=='O' && sol[x][y]==0){
            sol[x][y]=1;
            if(mazeHelp(maze,N,M,sol,x,y-1))
                return true;
            if(mazeHelp(maze,N,M,sol,x,y+1))
                return true;
            if(mazeHelp(maze,N,M,sol,x-1,y))
                return true;
            if(mazeHelp(maze,N,M,sol,x+1,y))
                return true;

            sol[x][y]=0;
            return false;

        }
        return false;

    }
}
