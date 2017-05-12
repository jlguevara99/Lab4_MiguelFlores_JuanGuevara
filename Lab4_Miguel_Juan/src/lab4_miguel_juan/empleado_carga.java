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
public class empleado_carga extends Empleado {

    private Date hora_entrada;
    private Date hora_salida;
    private Date inicio_trabajo;

    public empleado_carga(Date hora_entrada, Date hora_salida, Date inicio_trabajo, double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(sueldo, nombre, id, edad, altura, peso, residencia);
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.inicio_trabajo = inicio_trabajo;
    }

    public Date getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Date hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Date getInicio_trabajo() {
        return inicio_trabajo;
    }

    public void setInicio_trabajo(Date inicio_trabajo) {
        this.inicio_trabajo = inicio_trabajo;
    }

    @Override
    public String toString() {
        return "empleado_carga{" + "hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", inicio_trabajo=" + inicio_trabajo + '}';
    }

}
