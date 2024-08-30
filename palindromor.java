import java.util.Scanner;

public class palindromor{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while (!"FIM".equals(string)) {
            if (ehPalindromo(string, 0, string.length() - 1)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }

            string = scanner.nextLine();
        }

        scanner.close();
    }

    private static boolean ehPalindromo(String string, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }

        if (string.charAt(inicio) != string.charAt(fim)) {
            return false;
        }

        return ehPalindromo(string, inicio + 1, fim - 1);
    }
}
