import java.util.Scanner;

public class RadiansToDegrees_02
{
    public static void main(String[] args) {
       Scanner scnanner =  new Scanner(System.in);
       double radians = Double.parseDouble(scnanner.nextLine());
       double degrees = radians * 180 / Math.PI;
       System.out.println(degrees);
    }
}