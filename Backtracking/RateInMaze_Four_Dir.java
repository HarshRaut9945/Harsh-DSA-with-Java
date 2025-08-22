public class RateInMaze_Four_Dir {

    public static  void  Print(int sr,int sc,int er,int ec,String s,int[][]maze){
                  if(sr<0 || sc<0) return ;
                  if(sr>er || sc>ec) return ;
                  if(sr==er &&  sc==ec){
                    System.out.println(s);
                    return;
                      
                  }
                   if(maze[sr][sc]==0) return ;
                   if(maze[sr][sc]==-1) return;

                   maze[sr][sc] = -1;
                   
        Print(sr, sc+1, er, ec, s+"R", maze);
        //go down
        Print(sr+1, sc, er, ec, s+"D", maze);
              //go left
        Print(sr, sc-1, er, ec, s+"L", maze);
        //go up
        Print(sr-1, sc, er, ec, s+"U", maze);
        //backtrack
        
                   maze[sr][sc] = 1;
    }
    public static void main(String[] args) {
        int row=3;
        int col=4;

        int maze[][]={{2,3,4,5},
                       {6,7,8,9},
                        {5,1,7,8},
                        {2,4,6,8} };
                        Print(0, 0, row-1, col-1, "", maze);
                    
}
}
