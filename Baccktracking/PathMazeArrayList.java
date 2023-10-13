import java.util.ArrayList;

public class PathMazeArrayList {
    public static void main(String[] args) {
        System.out.println(pathMaze("", 3, 3));
    }
    public static ArrayList<String> pathMaze(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res=new ArrayList<>();
        if(row>1){
            res.addAll(pathMaze(p+"D", row-1, col));
        }
        if(col>1){
            res.addAll(pathMaze(p+"R", row, col-1));
        }
        return res;
    }
}
