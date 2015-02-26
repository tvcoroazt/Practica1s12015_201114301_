/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114301;

/**
 *
 * @author VicVCoro
 */
public class pila {
    
     private nodoPila bottom;
    private int depth;
    
    
    public pila(){
        bottom = new nodoPila();
        depth = 0;
    }
    
    
    public void Push(nodoPila node){
        nodoPila aux = bottom;
        while(aux.getNext() != null){
            aux = aux.getNext();
        }
        aux.setNext(node);
        node.setPrev(aux);
        depth++;
    }
    
    
    public nodoPila Peek(){
        nodoPila aux = bottom, ret = null;
        while(aux.getNext() != null){
            aux = aux.getNext();
            ret = aux;
        }
        return ret;
    }
    
    
    public nodoPila Pop(){
        nodoPila aux = bottom, ret = null;
        while(aux.getNext() != null){
            aux = aux.getNext();
        }
        if(aux != bottom){
            ret = aux;
            aux.getPrev().setNext(null);
            aux.setPrev(null);
            depth--;
        }
        return ret;
    }
    
    
    public int getDepth(){
        return depth;
    }
    
}
