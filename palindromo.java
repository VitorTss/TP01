import java.util.Scanner;

public class palindromo{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while(!"FIM".equals(string)){
            if(ehpalindromo(string)){
            System.out.println("SIM");
            }
            else System.out.println("NAO");

            string = scanner.nextLine();
        } 

        scanner.close();
    }

    private static boolean ehpalindromo(String string){

        boolean flag = true;

        int i = 0;

        while(i < string.length()/2 && flag){
            if(string.charAt(i) != string.charAt(string.length() -1 -i) ) {
                flag = false;
            }
            i++;
        }

        return flag;
    }


}

