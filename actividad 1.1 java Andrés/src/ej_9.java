import java.util.Scanner;

public class ej_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        int contadorEspacios = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorEspacios++;
            }
        }

        System.out.println("Número de espacios en la frase: " + contadorEspacios);
        scanner.close();
    }
}
//ANDRES