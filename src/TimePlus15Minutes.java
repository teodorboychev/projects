import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initHour = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());
        //15min
        //1 h 46 min + 15
        //60 + 46 + 15 = 121 min
        //121 / 60 = 2h
        //121 % 60 = 1
        int allMin = (initHour * 60) + initMin + 15;
        int hour = allMin / 60;
        int min = allMin % 60;
        if (hour > 23)
            hour = 0;
        System.out.printf("%d:%02d", hour, min);
    }
}
