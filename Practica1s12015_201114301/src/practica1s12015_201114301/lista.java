/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114301;

/**
 *
 * @author VicVCoro
 */
public class lista {
    int NumElementos = 0; 
    nodo Primero;   //Apuntador hacia el primero elemento de la lista
    nodo Ultimo; 
    
     public boolean EsVacio()
    {
        if(NumElementos==0){
            return true;
        }
        else {
            return false;
        }
    }
     
    public lista()
    {
        this.NumElementos = 0;
        this.Primero = null;
        this.Ultimo = null;
    }
    
    public lista(int elementos, nodo primero, nodo ultimo)
    {
    }
    
    
     public void AgregarNodo(nodo Nuevo)
    {
        try
        {
            if (EsVacio()==true)
            {   Primero = Nuevo;
                Ultimo = Nuevo;
            }
            else    
            {
                Ultimo.Siguiente = Nuevo;
            }
            NumElementos++; 
        }
        catch (Exception Ex)
        {

        }
    }
 
     // AGREGAR NODOS recibiendo parametros
     public void AgregarNodo(String nombre, int Dato, String elementos)
    {
        try
        {
            nodo Nuevo = new nodo(Dato,nombre,elementos);
           //Primero revisamos si la lista esta vacia
            if (EsVacio()==true)
            {   
                Primero = Nuevo;
                Ultimo = Nuevo;
            }
            else    //Si la lista no esta vacia, se agrega el nodo al final de la lista
            {
                Ultimo.Siguiente = Nuevo;
                Ultimo = Nuevo;
            }
            NumElementos++; //Aumentos el numero de elementos en la lista
        }
        catch (Exception Ex)
        {
        }
    }
     
         public void AgregarNodoFinal(String nombre, int Dato, String elementos)
    {
        try
        {
            nodo Nuevo = new nodo(Dato,nombre,elementos);
           //Primero revisamos si la lista esta vacia
            if (EsVacio()==false)
            {   
                Primero = Nuevo;
                Ultimo = Nuevo;
            }
            else    //Si la lista no esta vacia, se agrega el nodo al final de la lista
            {
                Ultimo.Siguiente = Nuevo;
                Ultimo = Nuevo;
            }
            NumElementos++; //Aumentos el numero de elementos en la lista
        }
        catch (Exception Ex)
        {
        }
    }
     
      public int ObtenerIndiceNodo(String nombre,int Dato)
    {
        try
        {
            if (EsVacio()!=true)
            {
                nodo Temp = Primero;
                int dat = -1;
                String nom ="";
                int contador = 1;
                while (Temp!=null)
                {
                    dat = Temp.Dato;
                    if ((dat == Dato) || (nom == nombre))//Son iguales
                    {
                        return contador;   
                    }
                    contador++; 
                    Temp = Temp.Siguiente; 
                }
                return -1;
            }
            else{return -1;}
        }
        catch(Exception Ex)
        {
            return -1;
        }
    }
     
      
        public nodo ObtenerNodoPorIndice(int posicion)
    {
        try
        {
            if (EsVacio()!=true)
            {
                nodo Temp = Primero;
                for (int i=1;i<posicion;i++)
                {
                    Temp = Temp.Siguiente;
                }
                return Temp;
            }
            else{return null;}
        }
        catch(Exception Ex)
        {
            return null;
        }
    }
    
     
        public boolean ElminarNodo(String nombre,int Dato)
    {
        try
        {
            if (EsVacio()!=true)
            {
                int pos = ObtenerIndiceNodo(nombre,Dato);
                if (pos==1 && NumElementos == 1)
                {
                    Primero = Ultimo = null; 
                }
                else if (pos ==1 && NumElementos>1)
                {
                    nodo Temp = Primero.Siguiente;
                    Primero.Siguiente = null; 
                    Primero = Temp; //El siguiente nodo pasa a ser el primero de la lista
                }
                else if (pos > 1 && pos == NumElementos)//Si se desea elminiar el ultimo nodo
                {
                    nodo Temp = ObtenerNodoPorIndice(pos-1); //Se obtiene el nodo anterior
                    Temp.Siguiente = null; //Se desvincula al ultimo nodo de la lista
                    Ultimo = Temp; //El penultimo nodo pasa a ser el ultimo
                }
                else //Es un nodo intermedio
                {
                    nodo Temp = ObtenerNodoPorIndice(pos-1); //Se obtiene el nodo anterior
                    nodo Aux = Temp.Siguiente; //Se crea un nodo axuliar
                    Temp.Siguiente = Aux.Siguiente; //Se re-arreglan los apuntadores
                    Aux.Siguiente = null; //Se desvincula el nodo a eliminar
                }
                NumElementos--;
                return true;
            }
            else{return false;}
        }
        catch(Exception Ex){return false;}
    }

        public int numeros()
        {
      
            String cadena2="";
            nodo Temp = Primero;
            
  
            return NumElementos;
    
        }
        
        
     public String ImpimirLista()
    {
        try
        {
            String cadena = "";
            nodo Temp = Primero;
            for (int i = 1; i<NumElementos;i++)
            {
                cadena = cadena + Temp.nombre + " " +String.valueOf(Temp.Dato) + " "+ Temp.elementos ; //Se convierte el valor numerico a string
                cadena = cadena + ",";
                Temp = Temp.Siguiente; 
            }
            cadena = cadena + Temp.nombre + " " + String.valueOf(Temp.Dato)  + " "+ Temp.elementos ;
            return cadena;
        }
        catch(Exception Ex)
        {
            return "Ha ocurrido un error";
        }
    }
     
}
