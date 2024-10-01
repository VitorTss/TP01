import java.util.Scanner;

public class ciframentor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        while (scanner.hasNext()) {
            string = scanner.nextLine();
            System.out.println(ciframento(string));
        }

        scanner.close();
    }

    private static String ciframento(String string) {
        return ciframentoRecursivo(string, 0);
    }

    private static String ciframentoRecursivo(String string, int index) {
        if (index >= string.length()) {
            return "";
        }

        char caractere = string.charAt(index);
        char novoCaractere;

        if (caractere >= 32 && caractere <= 126) {
            novoCaractere = (char) (caractere + 3);

            if (novoCaractere > 126) {
                novoCaractere = (char) (novoCaractere - 95);
            }
        } else {
            novoCaractere = caractere; // Mantém o caractere inalterado
        }

        return novoCaractere + ciframentoRecursivo(string, index + 1);
    }
}
