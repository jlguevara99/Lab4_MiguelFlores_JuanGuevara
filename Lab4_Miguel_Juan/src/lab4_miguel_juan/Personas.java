/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_miguel_juan;

/**
 *
 * @author Miguel Flores
 */
public class Personas {

    //atributos 
    private String nombre;
    private String id;
    private int edad;
    private double altura;
    private double peso;
    private String residencia;

    public Personas() {
    }

    public Personas(String nombre, String id, int edad, double altura, double peso, String residencia) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.residencia = residencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", residencia=" + residencia + '}';
    }

}
