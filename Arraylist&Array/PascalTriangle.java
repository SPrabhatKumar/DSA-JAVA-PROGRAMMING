import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(pascalRow(5));
    }
    public static ArrayList<Integer> pascalRow(int row){
        if(row==0){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            return list;
        }

        ArrayList<Integer> list=new ArrayList<>();
        int ans=1;
        for (int i = 0; i < row; i++) {
            list.add(ans);
            ans=ans*(row-i);
            ans=ans/(i+1);
        }
        return list;
    }
}
