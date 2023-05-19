
package pkg4.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V3TRIFIV {

   
    public static void main(String[] args) throws IOException {
     // Deaclaracion de variables
            BufferedReader bufentrada = new BufferedReader(new InputStreamReader(System.in));
            
        int numero;
        float mul3;
        float mul5;
        
    // Entrada de datos     
        System.out.println("Dame el numero"); 
        numero = Integer.parseInt (bufentrada.readLine());  
        
    // Salida de datos
        System.out.println(retornaMultiplo(numero));    
        
    }
    
    public static String retornaMultiplo (int num){
     
   int mul3;
   int mul5;

         //Procesar datos 
             mul3 = num % 3;
             mul5 = num % 5;
    
    
    //Salida de datos 
             
             if(mul3 == 0 && mul5==0){
                 return "TRIFIV" ;
             
             } 
        
             else if (mul3 ==0){
                   return "TRIF" ;             }
             
             else if (mul5==0){
                 return "FIV" ;
             
             }
             else {
                 System.out.println("No es multiplo de 3 y 5");
             }
    
    
    return "Ningun valor";
}
    
    
}
