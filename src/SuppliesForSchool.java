import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double packPens = 5.8;
        double packMarkers = 7.2;
        double cleanerLiter = 1.2;

        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        int countCleaner = Integer.parseInt(scanner.nextLine());
        double discountPerc = Integer.parseInt(scanner.nextLine());

        double pricePens = countPens * packPens;
        double priceMarkers = countMarkers * packMarkers;
        double priceCleaner = countCleaner * cleanerLiter;
        double price = priceCleaner + priceMarkers+ pricePens;
        double discount = discountPerc / 100;

        double finalPrice = price - (price * discount);
        System.out.println(finalPrice);
    }
}
