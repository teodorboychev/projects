import java.util.Scanner;

public class ExamCatsLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String poroda = scanner.nextLine();
        String sex = scanner.nextLine();
        int months = 0;
        if (poroda.equals("British Shorthair")) {
            if (sex.equals("m")) {
                months = 13 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
            else if (sex.equals("f")) {
                months = 14 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
        }
        else if (poroda.equals("Siamese")) {
            if (sex.equals("m")) {
                months = 15 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
            else if (sex.equals("f")) {
                months = 16 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
        }
        else if (poroda.equals("Persian")) {
            if (sex.equals("m")) {
                months = 14 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
            else if (sex.equals("f")) {
                months = 15 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
        }
        else if (poroda.equals("Ragdoll")) {
            if (sex.equals("m")) {
                months = 16 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
            else if (sex.equals("f")) {
                months = 17 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
        }
        else if (poroda.equals("American Shorthair")) {
            if (sex.equals("m")) {
                months = 12 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
            else if (sex.equals("f")) {
                months = 13 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
        }
        else if (poroda.equals("Siberian")) {
            if (sex.equals("m")) {
                months = 11 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
            else if (sex.equals("f")) {
                months = 12 * 12;
                int catMonths = months / 6;
                System.out.println(catMonths + " cat months");
            }
        }
        else
            System.out.println(poroda + " is invalid cat!");
    }
}
