import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chickenMenu = 10.35;
        double fishMenu = 12.4;
        double vegMenu = 8.15;

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veg = Integer.parseInt(scanner.nextLine());

        double sumChicken = chicken * chickenMenu;
        double sumFish = fish * fishMenu;
        double sumVeg = veg * vegMenu;
        double sum = sumChicken + sumFish + sumVeg;
        double dessert = sum * 0.2;
        double delivery = 2.5;

        double finalPrice = sum + dessert + delivery;
        System.out.println(finalPrice);
    }
}
