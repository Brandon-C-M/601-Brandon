
package excepciones6;
;
import java.util.Scanner;

public class EXCEPCIONES6 {
  public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un índice para acceder al elemento del arreglo: ");
        int index = scanner.nextInt();
        
        try {
            int element = array[index];
            System.out.println("El elemento obtenido es: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Se produjo una excepción!");
            System.out.println("El índice está fuera de los límites del arreglo.");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}

