import java.util.Scanner;
import java.util.*;

public class ExamGoldMine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLoc = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberLoc; i++) {
            int gold = 0;
            double sum = 0;
            int averageGoldIncome = Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < days; j++) {
                gold = Integer.parseInt(scanner.nextLine());
                 sum += gold;
            }
            double avarageGold = sum / days;
            if (avarageGold >= averageGoldIncome)
                System.out.printf("Good job! Average gold per day: %.2f.\n", avarageGold);
            else {
                double razlika = averageGoldIncome - avarageGold;
                System.out.printf("You need %.2f gold.", razlika);
            }
        }
    }
}

