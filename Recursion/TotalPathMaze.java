public class TotalPathMaze {
    public static int totalPath(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1||j==m-1){
            return 1;
        }
        int downwards=totalPath(i+1, j, n, m);
        int rightwards=totalPath(i, j+1, n, m);
        return downwards+rightwards;
    }
    public static void main(String[] args) {
        int totalPath=totalPath(0, 0, 3, 3);
        System.out.println(totalPath);
        
    }
}
