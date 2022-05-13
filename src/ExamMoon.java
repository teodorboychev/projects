import java.util.Scanner;

public class ExamMoon {
    public static void main(String[] args) {
        int distance = 384400; //384 400 km to the MOON
        int timeOnMoon = 3;
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine()); //sr. skorost
        double fuelPer = Double.parseDouble(scanner.nextLine()); // litri za 100km
        int wholeDistance = distance * 2;
        double time = Math.ceil(wholeDistance / speed);
        double endTime = time + timeOnMoon;
        System.out.println((int)endTime);
        double fuel = (fuelPer * wholeDistance) / 100;
        System.out.println((int)fuel);
    }
}
