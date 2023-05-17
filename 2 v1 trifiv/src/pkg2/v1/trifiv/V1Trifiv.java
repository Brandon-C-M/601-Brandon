
package pkg2.v1.trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V1Trifiv {

   
    public static void main(String[] args) throws IOException {
       
        BufferedReader bufentrada = new BufferedReader(new InputStreamReader(System.in));
        
//Declaracion de variables 
        
        int numero;
        float mul3;
        float mul5;
        
        System.out.println("Dame el numero"); 
        numero = Integer.parseInt (bufentrada.readLine() );
        
        mul3 = numero % 3;
        mul5 = numero % 5;
        if(mul3==0){
            System.out.println("Tri");        
        }
        
         if(mul5==0){
            System.out.println("Fiv");        
        }
        
          if(mul3==0 && mul5==0){
            System.out.println("Trifiv");        
        }
         
    }
    
}
