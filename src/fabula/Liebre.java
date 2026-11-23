package fabula;

import java.util.Random;

/**
 *
 * @author Felipe Jimenez Brioso
 */
public class Liebre extends Thread {
    
    int posicion = 1;
    
    @Override
    public void run(){
        Random aleatorio;
        int porcentaje;
        boolean duerme, granSalto, resbalonGrande, pequenoSalto, resbalonPequeno;
        
        aleatorio = new Random();
        
        while(posicion < 70){
            duerme = false;
            granSalto = false;
            resbalonGrande = false;
            pequenoSalto = false;
            resbalonPequeno = false;
            
            
            porcentaje = aleatorio.nextInt(100) + 1;
            
            if(porcentaje <= 20){           
                duerme = true;
            } else if(porcentaje <= 40){   
                granSalto = true;
            } else if(porcentaje <= 50){  
                resbalonGrande = true;
            } else if(porcentaje <= 80){    
                pequenoSalto = true;
            } else {                     
                resbalonPequeno = true;
            }
            
            try {
                if(duerme){
                    Thread.sleep(2000); // Duerme 2 segundos
                } else {
                    if(granSalto){
                        posicion += 9;
                    } else if(resbalonGrande){
                        posicion -= 12;
                    } else if(pequenoSalto){
                        posicion += 1;
                    } else if(resbalonPequeno){
                        posicion -= 2;
                    }
                    
                    
                    if(posicion < 1){
                        posicion = 1;
                    }
                    
                    Thread.sleep(1000); // Simula la acción esperando 1 segundo
                }
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }
}