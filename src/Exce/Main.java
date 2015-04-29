/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exce;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Inadaptado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        new Main();
    }
    public Main()
    {
        Tiempo tiempo=new Tiempo();
        Universe espacio = new Universe();
        IA ia=new IA();
        tiempo.start();
        espacio.start();
        
       while(true)
       {
            System.out.println();
            System.out.println("Esperando...");
            try {Thread.sleep(1000);}
            catch (InterruptedException ex)
            {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            ArrayList<Double> salidas=new ArrayList<Double>();
            for(Vida vida:espacio)
            {
                double consciencia=vida.getConsciencia();
                salidas.add((Double)(consciencia));
                if(consciencia!=0)
                { System.out.println(consciencia); }              
            }  
            ia.probar_decision(salidas);
       }
    }    
}
