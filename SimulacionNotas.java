
import java.util.Scanner;

public class SimulacionNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("CUantos aprendicez hay en el abmbiente ");
        int n = sc.nextInt();

        double suma = 0;
        double notaAlta = -10;
        double notaBaja = 50; 

        for (int i = 1; i <= n; i++) {

            System.out.print("Ingrese la nota del aprendiz " + i + ": ");

            double nota = sc.nextDouble();

            suma += nota;

            if (nota > notaAlta) {
                notaAlta = nota;

            }

            if (nota < notaBaja) {
                notaBaja = nota;

            }
        }

        double promedio = suma / n;

        System.out.println("\nPromedio = " + promedio);

        System.out.println("Nota mas alta = " + notaAlta);

        System.out.println("Nota más baja = " + notaBaja);
    

                sc.close();
    }
}