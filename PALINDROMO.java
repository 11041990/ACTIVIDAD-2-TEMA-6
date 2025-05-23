
package palindromo;
import java.util.Scanner;
public class PALINDROMO {

  // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String texto) {
        // Eliminamos espacios y convertimos a minúsculas para evitar errores por formato
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();
        int inicio = 0;
        int fin = textoLimpio.length() - 1;

        // Comparamos los caracteres desde los extremos hacia el centro
        while (inicio < fin) {
            if (textoLimpio.charAt(inicio) != textoLimpio.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.println("Ingresa una cadena de texto:");
        String cadena = scanner.nextLine();

        // Verificar si la cadena es un palíndromo
        if (esPalindromo(cadena)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        scanner.close();
    }
}
    
    

