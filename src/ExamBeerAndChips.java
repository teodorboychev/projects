import java.util.Scanner;

public class ExamBeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());
        double priceBeer = 1.2;
        double priceChips = beers * priceBeer * 0.45;
        double endPriceBeer = beers * priceBeer;
        double endPriceChips = Math.ceil(chips * priceChips);
        double wholePrice = endPriceBeer + endPriceChips;
        if (wholePrice <= budget) {
            double moneyLeft = budget - wholePrice;
            System.out.printf("%s bought a snack and has" +
                    " %.2f leva left.", name, moneyLeft);
        }
        if (wholePrice > budget) {
            double moneyNeeded = wholePrice - budget;
            System.out.printf("%s needs %.2f more leva!", name, moneyNeeded);
        }
    }
}
