import java.util.ArrayList;
import java.util.List;

public class DiagonalSum {
    public static void main(String[] args) {
        List<List<Integer>> l=new ArrayList<>();
        
    }
// 11 2 4
// 4 5 6
// 10 8 -12
     public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int row=0;
        int col=0;
        int fsum=0;
        while(row<arr.size()){
            fsum+=arr.get(row).get(col);
            row++;
            col++;
        }
        int srow=arr.size()-1;
        int scol=arr.size()-1;
        int ssum=0;
        while(srow>=0){
            ssum+=arr.get(srow).get(scol);
            srow--;
            scol--;
        }
        int res=fsum-ssum;
        return Math.abs(res);

    }
}
