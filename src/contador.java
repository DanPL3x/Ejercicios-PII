import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner Usuario = new Scanner(System.in);

        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = Usuario.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else {

                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        Usuario.close();
    }
}

