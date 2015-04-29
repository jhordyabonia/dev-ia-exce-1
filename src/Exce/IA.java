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
public class IA extends Thread
{
    int asiertos= 0;
    ArrayList<Double> decision= new ArrayList<Double>();
    ArrayList<ArrayList<Double>> patrones= new ArrayList<ArrayList<Double>>();
    ArrayList<ArrayList<Double>> ram= new ArrayList<ArrayList<Double>>();
    ArrayList<ArrayList<Double>> conviciones= new ArrayList<ArrayList<Double>>();
    Personalidad personalida=new Personalidad();
    
    public synchronized void addAsiertos()
    {
        asiertos++;
    }
    public synchronized void addPatrones(ArrayList<Double> data)
    {
        patrones.add(data);
    }
    public synchronized  void addConviciones(ArrayList<Double> data)
    {
        conviciones.add(data);
    }
    
    public ArrayList<Double> operar(char operador,ArrayList<Double> a,ArrayList<Double> b)
    {
        ArrayList<Double> out=new ArrayList<Double>();
        double operacion = 1;
        if(a.size()>=b.size())
        {
            out=(ArrayList<Double>)a.clone();
            a=(ArrayList<Double>)b.clone();
            b=(ArrayList<Double>)out.clone();
            out=new ArrayList<Double>();
        }
        if(operador=='-')
        {operacion = -1;}
        for(int i=0; i>b.size();i++)
        {
            out.add(a.get(i)+(operacion*b.get(i)));
        }
        return out;
    }
    
    public synchronized void decidir()
    {
        //Tomar el valor promedio en comviciones  y multiplicar por Personalidad.estado y Personalida.personalida
        //los patrones y multiplicar por Personalidad.estado y Personalida.personalida
        //los de aciertos y multiplicar por Personalidad.estado y Personalida.personalida
        //si el total de aciertos es superior al 1% el total de patrones
        //tomar el valor promedio de conviciones
        //de lo contrario tomar el valor promedio de patrones
    }
    
    public synchronized void probar_decision(ArrayList<Double> in)
    {
        //provar numero a numero de desicion con in
        //retornar la diferencia
        //si la diferencia es menor al 51% sera un acierto y
        //la desicion se agregara a conviciones
        //e in se agregara a patrones
        //si no in se agregara a patrones
        
        // in se agregara a ram        
        //fijar estado de personalida
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            decidir();
        }
        
    }
    
    public static void main(String args)
    {
        ArrayList<Double> a=new ArrayList<Double>();
        IA ia=new IA();
        a.add(1.0);
        for(Double b:ia.operar('+',a,a))
        {
            System.out.println(b);
        }
    }
    
    
}
