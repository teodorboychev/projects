import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brKucheshka = Integer.parseInt(scanner.nextLine());
        int brKoteshka = Integer.parseInt(scanner.nextLine());
        double kucheska = 2.5;
        double koteshka = 4;
        double sum = brKoteshka * koteshka + brKucheshka * kucheska;
        System.out.println(sum + " lv.");
    }
}
