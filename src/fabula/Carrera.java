/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fabula;

/**
 *
 * @author Felipe Jimenez Brioso
 */
public class Carrera {

    
    public static void main(String[] args) {
        
        Tortuga t1;
        Liebre t2;
        int i;
        
        t1 = new Tortuga();
        t2 = new Liebre();
        
        t1.start();
        t2.start();
        
        while(t1.posicion < 70 && t2.posicion < 70){
            
            
            for(i = 1; i <= 70; i++){
                if(i == t1.posicion || (t1.posicion >= 70 && i == 70)){
                    System.out.print("T");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
            
            
            for(i = 1; i <= 70; i++){
                if(i == t2.posicion || (t2.posicion >= 70 && i == 70)){
                    System.out.print("L");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
            
        if(t1.posicion >= 70 && t2.posicion >= 70){
            System.out.println("Empate");
        } else if(t1.posicion >= 70){
            System.out.println("Tortuga Gana");
        } else {
            System.out.println("Liebre Gana");
        }
        
    }
}
