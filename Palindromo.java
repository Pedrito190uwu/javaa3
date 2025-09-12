import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase = ");
        
        String palabra = sc.nextLine();

        palabra = palabra.toLowerCase().replace(" ", "");

        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {

            invertida += palabra.charAt(i);

        }

        if (palabra.equals(invertida)) {

            System.out.println("correcto si es un palindromo");

        } else {
            
            System.out.println("error no es un palindromo");
        }

        sc.close();
    }
}
