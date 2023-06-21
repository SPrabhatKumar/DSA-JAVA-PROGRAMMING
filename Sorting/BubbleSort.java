import java.util.Scanner;

/**
 * BubbleSort
 * Time Complexity of Bubble Sort is :O(n^2)
 * 
 */
 public class BubbleSort {
    public static void bubbleSort(int []arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if ( arr[j-1]<=arr[j]) {
                    
                }
                else{
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
        

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Array Size:");
        int size=sc.nextByte();
        int array[]=new int[size];
        System.out.println("Enter The Array Element :");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        bubbleSort(array);
        
        
        
    }
}