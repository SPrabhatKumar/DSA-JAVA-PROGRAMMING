import java.util.Arrays;
import java.util.List;

public class MigratoryBird {
    public static void main(String[] args) {
        int arr[]={1 ,2 ,3, 4 ,5 ,4 ,3 ,2 ,1 ,3, 4};
        System.out.println(migratoryBirds(arr));
    }
    public static int migratoryBirds(int [] arr) {
    // Write your code here
        int res[]=new int[5];
        for( int num:arr){
            if(num==1){
                res[0]+=1;
            }
            if(num==2){
                res[1]+=1;
            }
            if(num==3){
                res[2]+=1;
            }
            if(num==4){
                res[3]+=1;
            }
            if(num==5){
                res[4]+=1;
            }
        }
        System.out.println(Arrays.toString(res));
        int max=0;
        for(int n:res){
            if(n>max){
                max=n;
            }
        }
        return max;

    }


}
