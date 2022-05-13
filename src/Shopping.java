import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int graphicCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceGraphicCard = 250;
        double priceProcessor = graphicCard * priceGraphicCard * 0.35;
        double priceRam = graphicCard * priceGraphicCard * 0.1;

    }
}
