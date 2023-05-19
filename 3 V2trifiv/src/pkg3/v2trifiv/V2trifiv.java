
package pkg3.v2trifiv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V2trifiv {

   
    public static void main(String[] args) throws IOException {
       
    // Deaclaracion de variables
            BufferedReader bufentrada = new BufferedReader(new InputStreamReader(System.in));
            
        int numero;
        float mul3;
        float mul5;
        
    // Entrada de datos     
        System.out.println("Dame el numero"); 
        numero = Integer.parseInt (bufentrada.readLine());
        
         //Procesar datos 
             mul3 = numero % 3;
             mul5 = numero % 5;
             
             //Salida de datos 
             
             if(mul3 == 0 && mul5==0){
                 System.out.println("TRIFIV");
             
             } 
        
             else if (mul3 ==0){
                 System.out.println("TRI");    
             }
             
             else if (mul5==0){
                 System.out.println("FIV");
             
             }
             else {
                 System.out.println("No es multiplo de 3 y 5");
             }
             
    }
    
}
