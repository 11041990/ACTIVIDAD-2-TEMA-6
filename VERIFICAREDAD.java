
package verificaredad;
import java.util.Scanner;
public class VERIFICAREDAD {
// Función para determinar si una persona puede votar
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int edad = 20; // Cambia este valor para probar diferentes edades

        if (puedeVotar(edad)) {
            System.out.println("La persona puede votar.");
        } else {
            System.out.println("La persona no puede votar.");
        }
    }
}
    
    

