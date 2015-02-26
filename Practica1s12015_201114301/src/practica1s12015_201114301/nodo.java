/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114301;

/**
 *
 * @author VicVCoro
 */
public class nodo {
    
    public int Dato;    
    public String nombre;
    public nodo Siguiente; 
    public String elementos;
 
    public nodo(String nombre, int dato, String elementos, nodo sig)   
    {
        this.nombre=nombre;
        this.Dato = dato;
        this.elementos=elementos;
        this.Siguiente = sig;
    }
    
    public nodo(int dato,String nombre,String elementos)              
    {
        this.nombre=nombre;
        this.Dato = dato;
        this.elementos=elementos;
        this.Siguiente = null;
    }
    
    public nodo()                  
    {
        this.nombre="";
        this.Dato = 0;
        this.elementos="";
        this.Siguiente = null;
    }
    
     private String info; 
   

    
    
    
    
}
