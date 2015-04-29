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
public class Personalidad 
{
    public ArrayList<Double> estado = new ArrayList<Double>();
    public ArrayList<Double> imaginacion = new ArrayList<Double>();
    public ArrayList<Double> proyeciones = new ArrayList<Double>();
    
    //valores correspondeintas a los sentimiento
    public ArrayList<Double> personalida = new ArrayList<Double>();
    public void cambiar(ArrayList<Double> data)
    {
        //cambiar valores fijados
        //re-calcular los porcentajes de personalida da cuerdo a data.
    }
    
    public void fijar_estado(ArrayList<Double> data)
    {
        ArrayList<Double> tmp = null;
        //calcular tmp,deacuerdo con la entrada (data) y la personalidad
        estado= tmp;                
    }
    public double feliz()
    {
        //retornar el valor de la lista estado correspondiente a la felicidad 
        return 0.0;
    }
    public void imaginar(ArrayList<Double> in )
    {
        //cambiar el objeto imaginacion, acorde al estado, personalidad, y la entrada in
    }
    public void proyectar(ArrayList<Double> in )
    {
        //cambiar el objeto proyeciones, acorde al estado, personalidad, imaginacion y la entrada in
    }
    public double sentimiesntoX()
    {
        //retornar el valor de la lista estao correspondiente al sentimiesntoX...
        return 0.0;
    }
}
