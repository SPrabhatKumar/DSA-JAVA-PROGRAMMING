public class MazeMove4Dir {
    public static void main(String[] args) {
        boolean res[][]={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        moveFour("", res, 0, 0);
    }
    public static void moveFour(String p,boolean maze[][],int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            moveFour(p+"D", maze, r+1, c);
        }
        if(c<maze[0].length-1){
            moveFour(p+"R", maze, r, c+1);
        }
        if(r>0){
            moveFour(p+"U", maze, r-1, c);
        }
        if(c>0){
            moveFour(p+"L", maze, r, c-1);
        }
        maze[r][c]=false;
    }
}
