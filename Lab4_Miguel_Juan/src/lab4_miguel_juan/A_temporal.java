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
public class A_temporal extends Complejo{
private ArrayList <cliente> c;
private ArrayList <Empleado> e;
private ArrayList <Producto> p;

    public A_temporal( ArrayList<Empleado> e, ArrayList<Producto> p, ArrayList empleados, ArrayList productos, double tamaño, double altura, ArrayList clientes) {
        super(empleados, productos, tamaño, altura, clientes);
        this.c = c;
        this.e = e;
        this.p = p;
    }

    

    public A_temporal() {
    }

    public ArrayList<cliente> getC() {
        return c;
    }

    public void setC(ArrayList<cliente> c) {
        this.c = c;
    }

    public ArrayList<Empleado> getE() {
        return e;
    }

    public void setE(ArrayList<Empleado> e) {
        this.e = e;
    }

    public ArrayList<Producto> getP() {
        return p;
    }

    public void setP(ArrayList<Producto> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "A_temporal{" + "c=" + c + ", e=" + e + ", p=" + p + '}';
    }
    

    @Override
    public String[][] cifrado_riel(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[][] cifrado_transposicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String convercion_cadena_invercion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double cifrado_vigenere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String adelantar_posiciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[][] encriptacion_matrices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String declaracion_alfabeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
