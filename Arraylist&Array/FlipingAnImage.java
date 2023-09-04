import java.util.Arrays;
import java.util.Scanner;

public class FlipingAnImage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int image[][]=new int[3][3];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j]=sc.nextInt();
            }
        }
        for(int row=0;row<image.length;row++){
            for(int col=0;col<image[row].length;col++){
                int temp=image[row][col];
                image[row][col]=image[row][image[row].length-1-col];
                image[row][image[row].length-1-col]=temp;
            }
        }
        // flipAndInvertImage(image);
        // System.out.println(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.println(image[i][j]);
            }
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int row=0;row<image.length;row++){
            for(int col=0;col<image[row].length;col++){
                int temp=image[row][col];
                image[row][col]=image[row][image[row].length-1-col];
                image[row][image[row].length-1-col]=temp;
            }
        }
        return image;
    }
}
