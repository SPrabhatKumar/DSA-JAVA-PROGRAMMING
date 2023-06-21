import java.util.*;
public class ElementSearchInArray {
    public static void searchElement(int size,int []array,int element){
        int i=0;
        int temp=0;
        for(i=0;i<size;i++){
            if(array[i]==element){
                temp=i+1;
            } 
        }
        if(temp!=0){
            System.out.println("ELEMENT IS FOUND AT POSITION :"+temp);
        }
        else{
            System.out.println("Element is not found !");
        }
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter The elements In array :");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be Searched :");
        int element=sc.nextInt();
        searchElement(size, array, element);

    }
}
