
package Funciones;


public class funcionMultiplo {
    public String retonaMultiplo(int num){
      

//Salida de datos 
             
             if(num % 3 == 0 && num % 5==0){
                 return "TRIFIV" ;
             
             } 
        
             else if (num % 3 == 0 ){
                   return "TRIF" ;             }
             
             else if (num % 5 == 0 ){
                 return "FIV" ;
             
             }
            
    
    
    return "Ningun valor";
    
    }
}
