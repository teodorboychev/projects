import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysNeeded = Integer.parseInt(scanner.nextLine());

        int readingTime = pages / pagesPerHour;
        int hoursNeeded = readingTime / daysNeeded;
        System.out.println(hoursNeeded);
    }
}
