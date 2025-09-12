

import java.util.Scanner;

public class FrecuenciaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];


        System.out.println("Registra 10 numeros:");

        for (int i = 0; i < 10; i++) {

            System.out.print("Numero " + (i + 1) + ": ");

            numeros[i] = sc.nextInt();

        }

        boolean[] contados = new boolean[10];

        for (int i = 0; i < 10; i++) {

            if (!contados[i]) {

                int cuenta = 1;

                for (int j = i + 1; j < 10; j++) {

                    if (numeros[i] == numeros[j]) {

                        cuenta++;

                        contados[j] = true; 

                    }
                }

                System.out.println("El numero " + numeros[i] + " se repite " + cuenta + " veces");
            }
        }

                sc.close();

    }
}