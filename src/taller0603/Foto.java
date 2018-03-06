/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller0603;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Foto {
    private int coorx;
    private int coory;
    private String nombre;
    private Descripcion[] descripcion;
    private Etiquetados[] etiquetados;
    private Estudiante estudiante;
    Scanner sc= new Scanner(System.in);
    public Foto(){
        this.descripcion= new Descripcion[200];
        this.etiquetados= new Etiquetados[5];
    }

    public int getCoorx() {
        return coorx;
    }

    public int getCoory() {
        return coory;
    }

    public String getNombre() {
        return nombre;
    }

    public Descripcion[] getDescripcion() {
        return descripcion;
    }

    public void setCoorx(int coorx) {
        this.coorx = coorx;
    }

    public void setCoory(int coory) {
        this.coory = coory;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(Descripcion[] descripcion) {
        this.descripcion = descripcion;
    }

    public boolean Etiquetar(Etiquetados etiquetados){
        int i=0;
        int n;
        int a=0;
        while(i<2){
            if(this.etiquetados[a]==null){
                this.etiquetados[a]= etiquetados;
                return true;
            }
            else
                a++;
            if(a==5){
                return false;
            }
            if(i==1){
            System.out.println("Desea continuar? 1=NO 0=SI");
            n=sc.nextInt();
            i+=n;}
            else
                i++;
        }
        return false;
    }
    
    
    
}
