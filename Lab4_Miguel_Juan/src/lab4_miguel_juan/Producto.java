/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_miguel_juan;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Producto {
    private Calendar fecha;
    private int vida;
    private double precio;
    private double tamaño;
    private String descripcion;
    private String nombre;
    private int numeroP;

    public Producto() {
    }

    public Producto(Calendar fecha, int vida, double precio, double tamaño, String descripcion, String nombre, int numeroP) {
        this.fecha = fecha;
        this.vida = vida;
        this.precio = precio;
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.numeroP = numeroP;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    @Override
    public String toString() {
        return "Producto{" + "fecha=" + fecha + ", vida=" + vida + ", precio=" + precio + ", tama\u00f1o=" + tamaño + ", descripcion=" + descripcion + ", nombre=" + nombre + ", numeroP=" + numeroP + '}';
    }
    
}
