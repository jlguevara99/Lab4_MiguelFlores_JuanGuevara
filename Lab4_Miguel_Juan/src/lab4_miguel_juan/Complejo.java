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
public abstract class Complejo {

    private ArrayList empleados ;
    private ArrayList productos;
    private double tamaño;
    private double altura;
    private ArrayList clientes ;

    public Complejo(ArrayList empleados, ArrayList productos, double tamaño, double altura, ArrayList clientes) {
        this.empleados = empleados;
        this.productos = productos;
        this.tamaño = tamaño;
        this.altura = altura;
        this.clientes = clientes;
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
//metodos abstractos

    public abstract String[][] cifrado_riel(String contraseña);

    public abstract String[][] cifrado_transposicion(String clave, String contraseña);

    public abstract String convercion_cadena_invercion(String clave, String contraseña);

    public abstract String adelantar_posiciones(String contraseña);

}
