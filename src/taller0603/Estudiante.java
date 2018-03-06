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
public class Estudiante {
    private String nombre;
    private String apellido;
    private String nick;
    private int edad;
    private String clave;
    private String correo;
    
    private Comentarios[] comentarios;
    private Foto[] fotopropia;
    private Foto[] fotoajena;
    
    public Estudiante(){
        this.comentarios= new Comentarios[10];
        this.fotopropia = new Foto[100];
        this.fotoajena= new Foto[100];
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNick() {
        return nick;
    }

    public int getEdad() {
        return edad;
    }

    public String getClave() {
        return clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
