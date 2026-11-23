
package fabula;

import java.util.Random;



/**
 *
 * @author Felipe Jimenez Brioso
 */
public class Tortuga extends Thread{
     
    byte posicion=1;
    
    
    @Override
    public void run(){
        Random aleatorio;
        byte i;
        int porcentaje;
        boolean avanceRapido = false,resbalon = false,avanceLento=false;
        
        aleatorio = new Random();
        while(posicion < 70){
             
           porcentaje = aleatorio.nextInt((100));
           if(porcentaje <= 50){
               avanceRapido = true;
           }else if(porcentaje<=70){
               resbalon = true;
           }else{
               avanceLento=true;
           }
           
           try{
               if(avanceRapido){
                posicion += 3;
            } else if(resbalon){
                posicion -= 6;
                if(posicion < 1){
                    posicion = 1; 
                }
            } else if(avanceLento){
                posicion += 1;
            }
            Thread.sleep(1000);
           }catch(InterruptedException ie){
               
           }
           
        }
    }
    
}
