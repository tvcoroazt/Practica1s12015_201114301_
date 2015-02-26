/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114301;

/**
 *
 * @author VicVCoro
 */
public class listaUsuarios {
    
    Jugadores siguiente;
    Jugadores anterior;
    
    public static String nP;
    public static String nZ;
    public static String fP;
    public static String fZ;
    public static String cnP;
    public static String cnZ;
    public static String cfP;
    public static String cfZ;
    
    public listaUsuarios()
    {
        siguiente = null;
        anterior = null;
    }
    
    public void Cabeza(String info)
    {
        Jugadores nuevo = new Jugadores(info, siguiente); 
        siguiente = nuevo; 
        if(anterior == null)
        {
            anterior  = siguiente; 
        }   
    }
    
    public void Cola(String info)
    {
        Jugadores nuevo = new Jugadores(info, null); 
        
        if(siguiente == null) {
            anterior = nuevo;
            siguiente = anterior;
        }else 
        {
            anterior.setSiguiente(nuevo);
            anterior = nuevo;
        }
    }
    
     public void EliminarCabeza()
    {  
        siguiente = siguiente.siguiente;
    }
    
    public String VerPruebas()
    {
        String m = "";
        
        Jugadores temp = siguiente;
        while(temp != null)
        {
            m += temp.getInfo() + "\n";
            temp = temp.siguiente;            
        }
        return  m;  
    }    
    
    public void GUPlantas()
    {
        String m = ""; 
        String f = "";
        
        Jugadores temp = siguiente;
        while(temp != null)
        {
            m += temp.getInfo() + ";" + "\n";
            f += temp.getInfo() + "->"; 
            temp = temp.siguiente;            
        }
        nP = m;
        fP = f.substring(0, f.length() - 2) + ";"; 
    }    
    
    public void GUZombies()
    {
        String m= ""; 
        String f = "";
        
        Jugadores temp = siguiente;
        while(temp != null)
        {
            m += temp.getInfo() + ";" + "\n";
            f += temp.getInfo() + "->"; 
            temp = temp.siguiente;            
        }
        nZ = m;
        fZ = f.substring(0, f.length() - 2) + ";"; 
    }  
 
    
}

 class Jugadores {

    public Jugadores(String info, Jugadores siguiente) {
        this.info = info;
        this.siguiente = siguiente;
    }
    
    String info; 
    Jugadores siguiente; 
    
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Jugadores getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Jugadores siguiente) {
        this.siguiente = siguiente;
    }  
}
