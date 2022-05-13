import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nylonP = 1.5;
        double paintP = 14.5;
        double razrP = 5;

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razr = Integer.parseInt(scanner.nextLine());
        int chasove = Integer.parseInt(scanner.nextLine());

        double priceN = nylonP * (nylon + 2);
        double priceP = paintP *  (paint + (paint * 0.1));
        double priceR = razrP * razr;
        double turba = 0.4;
        double price = priceN + priceR + priceP + turba;
        double sumMaistori = (price * 0.3) * chasove;
        double finalPrice = sumMaistori + price;
        System.out.println(finalPrice);
    }
}
