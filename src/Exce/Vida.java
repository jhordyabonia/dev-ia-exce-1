/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exce;

import java.util.ArrayList;

/**
 *
 * @author Inadaptado
 */
public class Vida extends ArrayList<Vida> implements Runnable
{
    private double consciencia=1;
    private long posicion=0;
    private boolean available;
    private Thread hilo;
    
    
    public Vida(long p)
    {
        posicion=p;
        hilo=new Thread(this);
        hilo.start();
    }
    @Override    
    public void run()
    {
        while(true)
        {
          if(posicion>Universe.size_universe)
          { put(0);}
          else
          { put(posicion++); }
        }
    }        
    public synchronized long getPosicion() 
    {
        while (available == false)
        { 
            try {wait();}
            catch (InterruptedException e) { }             
        }
        available = false;
        notifyAll();
        return posicion;
    } 
    public synchronized void put(long value) 
    {
        while (available == true) 
        { 
            try {wait();}
            catch (InterruptedException e) { }
        } 
        posicion = value; 
        available = true; 
        notifyAll();
    }
        
    public synchronized double getConsciencia()
    {
        while (available == false)
        { 
            try { wait();}
            catch (InterruptedException e) { }             
        }
        available = false; 
        notifyAll();
        return this.size();
    }
    
    public void unir(Vida otro)
    {        
        if(otro.size()==this.size()||otro.size()==1)
        { 
             add((Vida)otro.clone());         
             //otro.clear();
        }
    }   
    
   public void start()
   {
       hilo.start();
   }
}
