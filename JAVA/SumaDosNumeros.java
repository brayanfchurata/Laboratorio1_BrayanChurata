import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar dos numeros al usuario
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        // Realizar la suma
        int suma = num1 + num2;

        // Mostrar el resultado
        System.out.println("La suma de los dos numeros es: " + suma);
    }
}
