import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero = ");
        int n = sc.nextInt();

        int suma = 0;


        for (int i = 1; i < n; i++) {

            if (n % i == 0) {

                suma += i;
            }
        }

        if (suma == n) {
            
            System.out.println(n + " Correcto es un numero perfecto ");

        } else {

            System.out.println(n + "Error no es un numero perfecto ");
        }

                sc.close();
    }
}
