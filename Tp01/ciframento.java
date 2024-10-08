import java.util.Scanner;

public class ciframento {

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
        StringBuilder novaString = new StringBuilder();
        char caractere;
        char novoCaractere;

        for (int i = 0; i < string.length(); i++) {   
            caractere = string.charAt(i);

            // Cifrar apenas caracteres imprimíveis
            if (caractere >= 32 && caractere <= 126) {
                novoCaractere = (char) (caractere + 3); 
                
                // Se o novo caractere ultrapassar o intervalo imprimível, volta para o incio do intervalo
                if (novoCaractere > 126) {
                    novoCaractere = (char) (novoCaractere - 95);
                }
                
                novaString.append(novoCaractere);
            } else {
                novaString.append(caractere);
            }
        }

        return novaString.toString();
    }
}
