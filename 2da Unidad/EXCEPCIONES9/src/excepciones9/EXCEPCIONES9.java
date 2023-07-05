
package excepciones9;

public class EXCEPCIONES9 {

    public static void main(String[] args) {
        try {
            Person person = null;
            String name = person.getName(); // Genera la excepción NullPointerException
            System.out.println("Nombre de la persona: " + name);
        } catch (NullPointerException e) {
            System.out.println("¡Se produjo una excepción!");
            System.out.println("Se intentó acceder a un objeto nulo.");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}
class Person {
    private String name;

    public String getName() {
        return name;
    }
    
}
