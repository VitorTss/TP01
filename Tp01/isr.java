import java.util.Scanner;

public class isr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        
        while(!"FIM".equals(string)) {
            if(conferirVogais(string, 0)) System.out.print("SIM ");
            else System.out.print("NAO ");

            if(conferirConsoantes(string, 0)) System.out.print("SIM ");
            else System.out.print("NAO ");

            if(conferirNumeroInteiro(string, 0)) System.out.print("SIM ");
            else System.out.print("NAO ");

            if(conferirNumeroReal(string, 0, 0)) System.out.print("SIM ");
            else System.out.print("NAO ");

            System.out.println("");
            string = scanner.nextLine();
        }

        scanner.close();
    }

    // Função recursiva para conferir vogais
    private static boolean conferirVogais(String string, int index) {
        if (index == string.length()) {
            return true;
        }

        char ch = string.charAt(index);
        if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' &&
            ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            return false;
        }

        return conferirVogais(string, index + 1);
    }

    // Função recursiva para conferir consoantes
    private static boolean conferirConsoantes(String string, int index) {
        if (index == string.length()) {
            return true;
        }

        char ch = string.charAt(index);
        if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
             ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ||
            (ch >= '0' && ch <= '9')) {
            return false;
        }

        return conferirConsoantes(string, index + 1);
    }

    private static boolean conferirNumeroInteiro(String string, int index) {
        if (index == string.length()) {
            return true;
        }

        char ch = string.charAt(index);
        if (ch < '0' || ch > '9') {
            return false;
        }

        return conferirNumeroInteiro(string, index + 1);
    }

    private static boolean conferirNumeroReal(String string, int index, int contaPontos) {
        if (index == string.length()) {
            return contaPontos <= 1;
        }

        char ch = string.charAt(index);
        
        if (ch < '0' || ch > '9') {
           
            if (ch == '.' || ch == ',') {
                contaPontos++;
             
                if (contaPontos > 1) {
                    return false;
                }
          
            } else {
                return false;
            }
        }

        return conferirNumeroReal(string, index + 1, contaPontos);
    }
}
