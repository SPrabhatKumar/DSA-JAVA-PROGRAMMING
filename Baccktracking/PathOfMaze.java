public class PathOfMaze {
    public static void main(String[] args) {
        pathMaze("", 3, 3);
    }
    public static void pathMaze(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathMaze(p+"D", r-1, c);
        } 
        if(c>1){
            pathMaze(p+"R", r, c-1);
        }
    }
}
