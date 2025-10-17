import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        String contrasenaCorrecta = "MiClaveSecreta123";
        Scanner scanner = new Scanner(System.in);
        int intentosRestantes = 3;
        boolean accesoConcedido = false;

        while (intentosRestantes > 0 && !accesoConcedido) {
            System.out.print("Introduce la contraseña: ");
            String entradaUsuario = scanner.nextLine();

            if (entradaUsuario.equals(contrasenaCorrecta)) {
                accesoConcedido = true;
                System.out.println("🎉 Enhorabuena");
            } else {
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("❌ Contraseña incorrecta. Te quedan " + intentosRestantes + " intento(s).");
                }
            }
        }

        if (!accesoConcedido) {
            System.out.println("🚫 Has agotado todos los intentos.");
        }

        scanner.close();
    }
}
//ANDRES