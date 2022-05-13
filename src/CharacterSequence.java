import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //System.out.println(text.length()); otpechatva broq na simvolite
        //System.out.println(text.charAt(0)); otpechatva simvola na poziciq 0
        //System.out.println(text.charAt(text.length() - 1); otpechatva posledniq simvol
        for (int position = 0; position <= text.length() - 1; position++){
            char currentSymbol = text.charAt(position);
            System.out.println(currentSymbol);
        }
    }
}
