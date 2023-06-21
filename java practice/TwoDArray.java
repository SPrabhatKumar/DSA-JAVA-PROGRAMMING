import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Row Size :");
        int row=in.nextInt();
        System.out.print("Enter The Column Size:");
        int column=in.nextInt();
        int array[][]= new int[row][column];
        System.out.println("Enter the elements in Array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]=in.nextInt();
                
            }   
        }    
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(" \t"+array[i][j]);                
            }
            System.out.println();   
        }    
    }     
}


                        