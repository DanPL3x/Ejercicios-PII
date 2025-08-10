import java.util.Scanner;

public class invertir {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = dato.nextLine();

        String invertido = new StringBuilder(texto).reverse().toString();

        System.out.println("Texto invertido: " + invertido);

        dato.close();
    }
}

