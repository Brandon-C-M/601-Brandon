
package excepciones10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class EXCEPCIONES10 {

    public static void main(String[] args) {
         try {
            // Escribir en un archivo
            FileWriter writer = new FileWriter("archivo.txt");
            writer.write("Hola, esto es un ejemplo de manejo de IOException.");
            writer.close();
            
            // Leer desde el archivo
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("¡Se produjo una excepción de E/S!");
            System.out.println("Ocurrió un error al leer o escribir el archivo.");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
    
}
