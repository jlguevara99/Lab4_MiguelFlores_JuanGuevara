/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_miguel_juan;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Complejo {
    private ArrayList empleados = new ArrayList();
    private ArrayList productos = new ArrayList();
    private double tamaño;
    private double altura;
    private ArrayList clientes = new ArrayList();

    public Complejo(double tamaño, double altura) {
        this.tamaño = tamaño;
        this.altura = altura;
    }

    public Complejo() {
    }

    public ArrayList getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList empleados) {
        this.empleados = empleados;
    }

    public ArrayList getProductos() {
        return productos;
    }

    public void setProductos(ArrayList productos) {
        this.productos = productos;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ArrayList getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Complejo{" + "empleados=" + empleados + ", productos=" + productos + ", tama\u00f1o=" + tamaño + ", altura=" + altura + ", clientes=" + clientes + '}';
    }
    
}
