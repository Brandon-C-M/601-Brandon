
package excepciones7;


public class EXCEPCIONES7 {

    
     public static void main(String[] args) {
         try {
            String str = "Hola";
            Object obj = str;
            
            Integer number = (Integer) obj; // Genera la excepción ClassCastException
            
            System.out.println("Número obtenido: " + number);
        } catch (ClassCastException e) {
            System.out.println("¡Se produjo una excepción!");
            System.out.println("La conversión entre tipos es inválida.");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
    
}
