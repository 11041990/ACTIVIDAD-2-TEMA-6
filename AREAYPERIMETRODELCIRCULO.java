
package areayperimetrodelcirculo;
import java.util.Scanner;

public class AREAYPERIMETRODELCIRCULO {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Solicitar el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área y el perímetro
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        // Mostrar los resultados
        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        scanner.close();
    }
}
    
    

