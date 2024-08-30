import java.util.Scanner;

public class is {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        
        while(!"FIM".equals(string)) {
            if(conferirVogais(string)) System.out.print("SIM ");
            else System.out.print("NAO ");

            if(conferirConsoantes(string)) System.out.print("SIM ");
            else System.out.print("NAO ");

            if(conferirNumeroInteiro(string)) System.out.print("SIM ");
            else System.out.print("NAO ");

            if(conferirNumeroReal(string)) System.out.print("SIM ");
            else System.out.print("NAO ");

            System.out.println("");
            string = scanner.nextLine();
        }

        scanner.close();
    }

    private static boolean conferirVogais(String string) {
        boolean flag = true;

        for(int i=0;i<string.length();i++) {
            if(string.charAt(i)!= 'A' && string.charAt(i)!= 'E' && string.charAt(i)!= 'I' && string.charAt(i)!= 'O' && string.charAt(i)!= 'U' && string.charAt(i)!= 'a' && string.charAt(i)!= 'e' && string.charAt(i)!= 'i' &&  string.charAt(i)!= 'o' && string.charAt(i)!= 'u') {
                flag = false;
            }
        }

        return flag;
    }

    private static boolean conferirConsoantes(String string) {
        boolean flag = true;

        for(int i=0;i<string.length();i++) {
            if(string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U' || string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' ||  string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                flag = false;
            }
            if(string.charAt(i) >= 48 && string.charAt(i) <= 57) flag = false;
        }
        return flag;
    }

    private static boolean conferirNumeroInteiro(String string) {
    boolean flag = true;

        for(int i=0;i<string.length();i++) {
            if(string.charAt(i) <= 47 || string.charAt(i) >= 58) {
                flag = false;
            }
        }
        return flag;
    }

    private static boolean conferirNumeroReal(String string) {
        boolean flag = true;
        int conta = 0;
        for(int i=0;i<string.length();i++) {
            if(string.charAt(i) <= 47 || string.charAt(i) >=58) {
                if(string.charAt(i) == 44 || string.charAt(i) == 46) {
                    conta++;
                }
                else flag = false;
            }
        }
        if(conta > 1) flag = false;
        return flag;
    }

}