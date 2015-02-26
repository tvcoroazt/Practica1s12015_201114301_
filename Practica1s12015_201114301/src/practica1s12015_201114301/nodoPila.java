/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114301;

/**
 *
 * @author VicVCoro
 */
public class nodoPila {
    
      private int before, after;
    private nodoPila next, prev;
    
    public nodoPila(){
        next = null;
    }
    
    public nodoPila(int b, int a){
        before = b;
        after = a;
        next = null;
        prev = null;
    }
    
    public int getBefore(){
        return before;
    }
    
    public int getAfter(){
        return after;
    }
    
    public nodoPila getNext(){
        return next;
    }
    
    public void setNext(nodoPila node){
        next = node;
    }
    
    public nodoPila getPrev(){
        return prev;
    }
    
    public void setPrev(nodoPila node){
        prev = node;
    }
    
    
}
