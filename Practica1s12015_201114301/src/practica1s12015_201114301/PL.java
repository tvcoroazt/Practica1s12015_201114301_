/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114301;

/**
 *
 * @author VicVCoro
 */
public class PL{
     private String tipoPlanta;
    private String imagenPlanta;
    private String NombrePlanta;
    private String distanciaPlanta;
    private int ataquePlanta;
    private int defensaPlanta;
    
    public PL(String tipo, String imagen, String Nombre, String distancia, int ataque, int defensa) {
        this.tipoPlanta = tipo;
        this.imagenPlanta = imagen;
        this.NombrePlanta = Nombre;
        this.distanciaPlanta = distancia;
        this.ataquePlanta = ataque;
        this.defensaPlanta = defensa;
    } 
    
    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public String getImagenPlanta() {
        return imagenPlanta;
    }

    public void setImagenPlanta(String imagenPlanta) {
        this.imagenPlanta = imagenPlanta;
    }

    public String getNombrePlanta() {
        return NombrePlanta;
    }

    public void setNombrePlanta(String NombrePlanta) {
        this.NombrePlanta = NombrePlanta;
    }

    public int getAtaquePlanta() {
        return ataquePlanta;
    }

    public void setAtaquePlanta(int ataquePlanta) {
        this.ataquePlanta = ataquePlanta;
    }

    public int getDefensaPlanta() {
        return defensaPlanta;
    }

    public void setDefensaPlanta(int defensaPlanta) {
        this.defensaPlanta = defensaPlanta;
    }

   
}
