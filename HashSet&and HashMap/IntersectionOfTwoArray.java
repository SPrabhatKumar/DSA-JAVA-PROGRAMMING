import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static void printIntersection(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
             set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                System.out.println(arr2[j]);
                set.remove(arr2[j]);
            }
        }
         
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        printIntersection(arr1, arr2);
        
    }
}
