/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_miguel_juan;

import java.util.Date;

/**
 *
 * @author Miguel Flores
 */
public class cliente extends Personas {

    private double presupuesto;
    private Date primer_prdocto;
    private int cantidad_productos;

    public cliente(double presupuesto, Date primer_prdocto, int cantidad_productos, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(nombre, id, edad, altura, peso, residencia);
        this.presupuesto = presupuesto;
        this.primer_prdocto = primer_prdocto;
        this.cantidad_productos = cantidad_productos;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getPrimer_prdocto() {
        return primer_prdocto;
    }

    public void setPrimer_prdocto(Date primer_prdocto) {
        this.primer_prdocto = primer_prdocto;
    }

    public int getCantidad_productos() {
        return cantidad_productos;
    }

    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    @Override
    public String toString() {
        return "cliente{" + "presupuesto=" + presupuesto + ", primer_prdocto=" + primer_prdocto + ", cantidad_productos=" + cantidad_productos + '}';
    }
    
    //dsadsa
    

}
