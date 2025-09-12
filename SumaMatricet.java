import java.util.Scanner;

public class SumaMatricet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] suma = new int[2][2];

        System.out.println("Ingrese matrit uno = ");

        for (int i = 0; i < 2; i++)

            for (int j = 0; j < 2; j++)

                m1[i][j] = sc.nextInt();

        System.out.println("Ingrese matrit dos = ");

        for (int i = 0; i < 2; i++)

            for (int j = 0; j < 2; j++)

                m2[i][j] = sc.nextInt();


        for (int i = 0; i < 2; i++)

            for (int j = 0; j < 2; j++)

                suma[i][j] = m1[i][j] + m2[i][j];

        System.out.println("Su resultado es =");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++)

                System.out.print(suma[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
