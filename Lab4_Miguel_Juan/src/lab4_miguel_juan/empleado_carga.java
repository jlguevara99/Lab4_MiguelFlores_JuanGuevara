/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_miguel_juan;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import static lab4_miguel_juan.Lab4_Miguel_Juan.sc;

/**
 *
 * @author Miguel Flores
 */
public class empleado_carga extends Empleado {

    private int hora_entrada;
    private int hora_salida;
    private Calendar inicio_trabajo;

    public empleado_carga() {
    }

    public empleado_carga(int hora_entrada, int hora_salida, Calendar inicio_trabajo, double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(sueldo, nombre, id, edad, altura, peso, residencia);
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.inicio_trabajo = inicio_trabajo;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Calendar getInicio_trabajo() {
        return inicio_trabajo;
    }

    public void setInicio_trabajo(Calendar inicio_trabajo) {
        this.inicio_trabajo = inicio_trabajo;
    }
    

    

    @Override
    public String toString() {
        return super.toString()+"empleado_carga{" + "hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + '}';
    }

}
