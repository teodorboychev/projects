import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePuzzle = 2.6;
        double priceDoll = 3;
        double priceBear = 4.1;
        double priceMinion = 8.2;
        double priceTruck = 2;
        double holiday = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = (pricePuzzle * puzzle) + (priceDoll * dolls)
                + (priceBear * teddyBears) + (priceMinion * minions)
                + (priceTruck * trucks);
        if (puzzle + dolls + teddyBears + minions + trucks >= 50)
            sum = sum - (sum * 0.25);
        sum = sum - (sum * 0.1);
        double diff = Math.abs(sum - holiday);
        if (sum >= holiday) {
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else{
            double moneyNeeded = holiday - sum;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }

    }
}