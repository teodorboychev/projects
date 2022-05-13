import java.util.Scanner;

public class ExamPuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilograms = Integer.parseInt(scanner.nextLine());
        int food = kilograms * 1000;
        int foodEaten = 0;
        String gramsPerDay = scanner.nextLine();

        while (!gramsPerDay.equals("Adopted")) {
            double sum = Double.parseDouble(gramsPerDay);
            gramsPerDay = scanner.nextLine();
            foodEaten += sum;
        }
        if (food >= foodEaten) {
            int foodLeft = food - foodEaten;
            System.out.printf("Food is enough! Leftovers: " + foodLeft + " grams.");
        } else {
            int neededFood = foodEaten - food;
            System.out.printf("Food is not enough. You need " + neededFood + " grams more.");
        }
    }
}
