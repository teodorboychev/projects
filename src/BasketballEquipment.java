import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearlyTax = Integer.parseInt(scanner.nextLine());
        double shoes = yearlyTax - (yearlyTax * 0.4);
        double jersey = shoes - (shoes * 0.2);
        double ball = jersey / 4;
        double accessories = ball / 5;

        double price = yearlyTax + shoes + jersey + ball + accessories;
        System.out.println(price);
    }
}
