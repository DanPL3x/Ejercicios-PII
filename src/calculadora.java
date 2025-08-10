import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner Usuario = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = Usuario.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = Usuario.nextDouble();

        System.out.println("Seleccione operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = Usuario.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }

        Usuario.close();

        System.out.println("Mensaje de prueba para ver la sincronizacioon con GIT");
    }
}
