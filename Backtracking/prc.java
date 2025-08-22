public class prc {

    public static void PrintKk(int sr, int sc, int er, int ec, String s, boolean [][] isVisited ){

        // Out of bounds check
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;

        // Already visited
        if(isVisited[sr][sc]) return;

        // Destination reached
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        } 

        // Mark visited
        isVisited[sr][sc] = true;

        // Explore all directions
        PrintKk(sr, sc+1, er, ec, s+"R", isVisited); // Right
        PrintKk(sr+1, sc, er, ec, s+"D", isVisited); // Down
        PrintKk(sr, sc-1, er, ec, s+"L", isVisited); // Left
        PrintKk(sr-1, sc, er, ec, s+"U", isVisited); // Up

        // Backtrack
        isVisited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        boolean[][] isVisited = new boolean[row][col];
        PrintKk(0, 0, row-1, col-1, "", isVisited);
    }
}
