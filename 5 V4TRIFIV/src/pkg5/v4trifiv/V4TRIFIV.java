
package pkg5.v4trifiv;

import Funciones.funcionMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V4TRIFIV {

    
    public static void main(String[] args) throws IOException {
       
         // Deaclaracion de variables
            BufferedReader bufentrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            funcionMultiplo mult = new funcionMultiplo();
            // Entradad de Datos
            System.out.println("Dame un numero");
            numero = Integer.parseInt (bufentrada.readLine());  
            
            System.out.println(mult.retonaMultiplo(numero));
        
    }
    
}
