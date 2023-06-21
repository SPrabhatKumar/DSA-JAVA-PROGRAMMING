import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Row Size :");
        int row = in.nextInt();
        System.out.print("Enter The Column Size:");
        int column = in.nextInt();
        int array[][] = new int[row][column];
        System.out.println("Enter the elements in Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = in.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" \t" + array[i][j]);
            }
            System.out.println();
        }
        System.out.print("Enter The Element to be Searched: ");
        int ele = in.nextInt();
        boolean tem = false;
        int row_value = 0, column_value = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] == ele) {
                    row_value = i + 1;
                    column_value = j + 1;
                    tem = true;
                    break;
                }
            }
        }
        if (tem == false) {
            System.out.println("Element is Not Found :");

        } else {
            System.out.println("Element is Found at " + row_value + " " + column_value);
        }
    }
}
