/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exce;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Inadaptado
 */
public final class Tiempo extends Thread
{
    int estado=1;
    private boolean available;
   
    public synchronized int getEstado() 
    {
        while (available == false)
        { 
            try 
            { // Espera a que put() asigne el valor y lo comunique con notify() 
                wait();
            } catch (InterruptedException e) { } 
            
        }
     available = false;
     // notifica que el valor ha sido leído 
     notifyAll();
     // devuelve el valor 
     return estado;
    } 
    public synchronized void put(int value) 
    {
        while (available == true) 
        { try {
            // Espera a que get() lea el valor disponible antes de darle otro 
            wait();
        } catch (InterruptedException e) { } } 
        // ofrece un nuevo valor y lo declara disponible 
        estado = value; 
        available = true; 
        // notifica que el valor ha sido cambiado
        notifyAll();
    }
    @Override
    public void run()
    {
        while(true)
        {    
           put(estado*-1);
        }        
    }    
}
