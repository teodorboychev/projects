import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerSqMeter = 7.61;
        double sqMeters = Integer.parseInt(scanner.nextLine());
        double price = sqMeters * pricePerSqMeter;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.println("The final price is: "+finalPrice+" lv.");
        System.out.println("The discount is: "+discount+" lv.");
    }
}
