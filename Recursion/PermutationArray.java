import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3};
        List<Integer>curr=new ArrayList<>();
        boolean bool[]=new boolean[arr.length];
        printPermutation(arr,curr,bool);
    }
    public static void printPermutation(int []arr,List<Integer> curr,boolean bool[]){
        if(arr.length==curr.size()){
            System.out.println(curr);
        }
        for (int i = 0; i < arr.length; i++) {
            if (bool[i]){
                continue;
            }
            curr.add(arr[i]);
            bool[i]=true;
            printPermutation(arr,curr,bool);
            bool[i]=false;
            curr.remove(curr.size()-1);
        }
    }

}
