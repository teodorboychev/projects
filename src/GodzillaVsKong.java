import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        int priceOutfit = Integer.parseInt(scanner.nextLine());
        double decor = budget * 0.1;
        double discount = 0;
        if (statists > 150)
            discount = priceOutfit * 0.1;
        double totalSum = decor + priceOutfit - discount;
        if (budget >= totalSum){
            double moneyLeft = budget - totalSum;
            System.out.println("Action");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
        else {
            double moneyNeeded = totalSum - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more", moneyNeeded);
        }
    }
}
