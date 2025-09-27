import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa 2 numeros");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        double resultado = 0;

        if (numero1 >= numero2) {
            resultado = numero1 + numero2;
            System.out.println("la suma de los numero es: " + resultado);
            resultado = numero1 - numero2;
            System.out.println("la resta de los numeros es: " + resultado);
        } else 
        if (numero1 < numero2) {
            
            if (numero2 == 0) {
                  resultado = numero1 * numero2;
                System.out.println("la division no se puede hacer");
            } else
            resultado=numero1/numero2;
                System.out.println("la  dividion es: " + resultado);
              

            scanner.close();

        }

    }

}
