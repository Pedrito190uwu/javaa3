import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un numero  " + (i + 1) + " = ");
            numeros[i] = sc.nextInt();
        }

        boolean cambiado = true;

        while (cambiado) {
            cambiado = false; 

            for (int i = 0; i < numeros.length - 1; i++) {

                if (numeros[i] > numeros[i + 1]) {

                    int temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                    cambiado = true;
                }
            }
        }

        System.out.println("\nNumeros se ordena de menor a mayor =");

        for (int num : numeros) {

            System.out.print(num + " ");
        }

                sc.close();
    }
}
