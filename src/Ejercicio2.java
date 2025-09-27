import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double promedio = 0;

        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("ingresa su nota" + (i + 1) + ":");
            notas[i] = scanner.nextInt();
        }
        promedio = notas[1] + notas[2] + notas[3];
        System.out.println("el promedio de sus notas es de: " + promedio);

        if (promedio >= 7.0) {
            System.out.println("promocionado");
        } else if (promedio < 7.0 && promedio >= 4) {
            System.out.println("regular");
        } else if (promedio < 4.0) {
            System.out.println();
            scanner.close();
        }
        
    }
}
