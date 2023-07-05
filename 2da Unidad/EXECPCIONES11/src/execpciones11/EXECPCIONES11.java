
package execpciones11;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EXECPCIONES11 {

    public static void main(String[] args) {
    try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡Se produjo una excepción de archivo no encontrado!");
            System.out.println("El archivo no existe o no se puede acceder.");
            System.out.println("Mensaje: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("¡Se produjo una excepción de E/S!");
            System.out.println("Ocurrió un error al leer el archivo.");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
    
}
