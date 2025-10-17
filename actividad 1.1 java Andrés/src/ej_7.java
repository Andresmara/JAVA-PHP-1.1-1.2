import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        String contrasenaCorrecta = "miSecreta123";  // Contraseña almacenada
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;
        boolean accesoConcedido = false;

        while (intentos > 0 && !accesoConcedido) {
            System.out.print("Introduce la contraseña: ");
            String contrasenaIntroducida = scanner.nextLine();

            if (contrasenaIntroducida.equals(contrasenaCorrecta)) {
                System.out.println("Enhorabuena");
                accesoConcedido = true;  // Salir del bucle si acierta
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado los 3 intentos.");
                }
            }
        }
        scanner.close();
    }
}
//ANDRES