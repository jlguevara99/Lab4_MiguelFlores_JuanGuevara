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
public class empleado_seguridad extends Empleado {
private String clave;
private String dia;

    public empleado_seguridad() {
    }

    public empleado_seguridad(String clave, String dia, double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(sueldo, nombre, id, edad, altura, peso, residencia);
        this.clave = clave;
        this.dia = dia;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "empleado_seguridad{" + "clave=" + clave + ", dia=" + dia + '}';
    }

    
    
}
