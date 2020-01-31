/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artifactejercicio;

/**
 *
 * @author usuario
 */
public class Persona {

    private String nombre;
    private int edad;
    private int hijos;

    public Persona(String nombre, int edad, int hijos) {
        this.nombre = nombre;
        this.edad = edad;
        this.hijos = hijos;
    }

    public Persona() {
        this.edad = 19;
        this.hijos = 0;
        this.nombre = "Rosario";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", hijos=" + hijos + '}';
    }

    public void mostrarInfor() {
        System.out.println("El nombre de la persona es: " + nombre + ", tiene " + hijos + " hijos y su edad es: " + edad);
    }

}
