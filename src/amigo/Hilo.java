package amigo;

/**
 *
 * @author Felipe Jimenez Brioso
 */
public class Hilo extends Thread {
       
    int numInicio, numFin;
    
    public Hilo(int inicio, int fin){
        this.numInicio = inicio;
        this.numFin = fin;
    }
    
    @Override
    public void run(){
        int sumaDivisores1, sumaDivisores2;
        int i, j;
        
        for(i = this.numInicio; i <= this.numFin; i += 5){
            
            sumaDivisores1 = 0;
            for(j = 1; j < i; j++){
                if(i % j == 0){
                    sumaDivisores1 += j;
                }
            }
            
            if(sumaDivisores1 > i){
                sumaDivisores2 = 0;     
                for(j = 1; j < sumaDivisores1; j++){
                    if(sumaDivisores1 % j == 0){
                        sumaDivisores2 += j;
                    }
                }
                
                if(sumaDivisores2 == i){
                    System.out.println(i + " es amigo de " + sumaDivisores1);
                }
            }
        }
    }
}