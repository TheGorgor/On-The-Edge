import java.util.Scanner;

public class InputHelper {
    public static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                valid = true;
            } else {
                System.out.println("Lütfen geçerli bir tam sayı girin.");
                scanner.next(); // geçersiz girdiyi temizle
            }
        }

        return input;
    }
}
