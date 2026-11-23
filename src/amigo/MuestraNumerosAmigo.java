package amigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Felipe Jimenez Brioso
 */
public class MuestraNumerosAmigo {

    
    public static void main(String[] args) {
        Hilo t1,t2,t3,t4,t5;
        BufferedReader teclado;
        int numero;
        boolean correcto;
             
        correcto = false;
        teclado = new BufferedReader(new InputStreamReader(System.in));
        t1=null;
        t2=null;
        t3=null;
        t4=null;
        t5=null;
        do{
            try{
                System.out.print("Introduzca numero :");
                numero = Integer.parseInt(teclado.readLine());
                
                t1=new Hilo(1,numero);
                t2=new Hilo(2,numero);
                t3=new Hilo(3,numero);
                t4=new Hilo(4,numero);
                t5=new Hilo(5,numero);
                correcto = true;
            }catch(NumberFormatException nfe){
                System.out.println("Formato incorrecto");
                correcto = false; 
            }catch(IOException ioe){
                System.out.println("Error E/S");
            }
                    
        }while(correcto == false );
            
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
