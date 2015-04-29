/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exce;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Inadaptado
 */
public class Universe extends  ArrayList<Vida> implements Runnable
{
    private Thread hilo;
    public static final int poblacion=100;
    public static final double size_universe=1000;
    
    public Universe()
    {
        hilo= new Thread(this);        
    }
    public void  start()
    {
        Random ran;
        for(int i=0;i<Universe.poblacion;i++)
        {
            ran= new Random();
            add(new Vida(ran.nextInt(((int) Universe.size_universe))));
        }
        hilo.start();
    }
    public synchronized void check()
    {
        for(Vida anterior:this)
        {
            for(Vida vida:this)
            {
                if(anterior!=null)
                {
                    if(vida.getPosicion()==anterior.getPosicion())
                    {
                        vida.unir((Vida)anterior.clone());
                        //anterior.clear();
                    } 
                }
            }
        }
    }

    @Override
    public void run() 
    {
        while(true)
        {
            check();
        }
    }
    
    
}
