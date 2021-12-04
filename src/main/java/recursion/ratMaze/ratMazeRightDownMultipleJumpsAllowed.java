package recursion.ratMaze;

//https://www.geeksforgeeks.org/rat-in-a-maze-with-multiple-steps-jump-allowed/
public class ratMazeRightDownMultipleJumpsAllowed {
    static boolean visited[][]=new boolean[4][4];
    static int N=4;
    public static void main(String[] args) {
        int maze[][] = {{2, 1, 0, 0},
                {3, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 1}};
        System.out.println(solveMaze(maze,0,0,visited));

    }

    public static boolean solveMaze(int[][] maze,int x ,int y,boolean[][] visited)
    {

            if(x==N-1 || y==N-1)
            {
                visited[x][y]=true;
                return true;

            }
            if(isSafe(maze,x,y))
            {
                visited[x][y]=true;

                for(int i=1;i<=maze[x][y] && i<N;i++)
                {
                    if(solveMaze(maze,x+i,y,visited)) return true;
                    if(solveMaze(maze,x,y+i,visited)) return true;

                }
                visited[x][y]=false;
                return false;

            }


            return false;
    }

    public static boolean isSafe(int[][] maze,int x, int y)
    {
        if(x>=0 && y>=0 && y<N && x<N && maze[x][y]!=0) return true;
        return false;

    }
}
