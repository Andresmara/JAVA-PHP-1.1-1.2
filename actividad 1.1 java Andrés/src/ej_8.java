import java.util.Scanner;

public class ej_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String dia = scanner.nextLine().toLowerCase();  // Convertimos a minúsculas para evitar errores

        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":  // por si no usa tilde
            case "jueves":
            case "viernes":
                System.out.println(dia + " es un día laboral.");
                break;
            case "sábado":
            case "sabado":    // sin tilde
            case "domingo":
                System.out.println(dia + " no es un día laboral.");
                break;
            default:
                System.out.println("No has introducido un día válido.");
                break;
        }
        scanner.close();
    }
}
//ANDRES