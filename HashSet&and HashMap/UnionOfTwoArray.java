import java.util.HashSet;

public class UnionOfTwoArray {
    public static void printUnionSet(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int arr1[]={1,3,4,5};
        int arr2[]={4,5,6,7};
        printUnionSet(arr1, arr2);
    }
}
