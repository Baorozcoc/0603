/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller0603;

/**
 *
 * @author Estudiante
 */
public class Etiquetados {
    private String usuarioreg;
    private String usuarionoreg;
    private int posx;
    private int posy;
    
    public Etiquetados(int x, int y){
        this.posx= x;
        this.posy= y;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
    public boolean Usuario(Estudiante estudiante, String nombre, String apellido){
        if(estudiante.getNombre().equals(nombre)&&estudiante.getApellido().equals(apellido)){
            usuarioreg= nombre;
            usuarioreg+= apellido;
            return true;
        }
        else{
            usuarionoreg=nombre;
            usuarionoreg+=apellido;
        }
        return false;
    }
}
