
package excepciones8;


public class EXCEPCIONES8 {

    
     public static void main(String[] args) {
        try {
            String className = "com.example.NonExistentClass";
            Class<?> clazz = Class.forName(className);
            System.out.println("Clase cargada: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("¡Se produjo una excepción!");
            System.out.println("No se pudo encontrar la clase especificada.");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
    
}
