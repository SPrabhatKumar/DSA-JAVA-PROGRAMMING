import java.util.Scanner;

public class TemperaturConverter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Temperature in Celsius:");
        int tempC=in.nextInt();
//        float tempF=(float)(tempC * 9/5)+32;
        float tempF=(tempC * 9/5)+32;// it will implictely convert expression into float

        System.out.println(tempF);
    }
}
