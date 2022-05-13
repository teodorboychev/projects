import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = projects * 3;
        System.out.println("The architect "+name+" will need "+hoursNeeded
                +" hours to complete "+ projects+" project/s.");
    }
}
