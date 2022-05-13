import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.println(area);
        }
        else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            System.out.println(area);
        }
        else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double area = r * r * Math.PI;
            System.out.println(area);
        }
        else if (figure.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b / 2;
            System.out.println(area);
        }


    }
}
