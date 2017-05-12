/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_miguel_juan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab4_Miguel_Juan {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Empleado> empleados = new ArrayList();

        ArrayList<cliente> clientes = new ArrayList();
        ArrayList<Producto> productos = new ArrayList();
        ArrayList<Complejo> almacenes = new ArrayList();
        int opcion = 0;
        boolean verdad = true;
        do {
            System.out.println("***MENU***");
            System.out.println("1. Crear Personas");
            System.out.println("2. Crear Productos");
            System.out.println("3. Crear Almacenes");
            System.out.println("4. Modificar Persona");
            System.out.println("5. Eliminar Persona");
            System.out.println("6. Modificar Producto");
            System.out.println("7. Eliminar Poducto");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese ID");
                    String id = sc.nextLine();
                    System.out.println("Ingrese altura: ");
                    double altura = sc.nextDouble();
                    System.out.println("Ingrese sueldo: ");
                    double sueldo = sc.nextDouble();
                    System.out.println("Ingrese edad");
                    int edad = sc.nextInt();
                    verdad = true;
                    System.out.println("Ingrese peso");
                    double peso = sc.nextDouble();
                    System.out.println("Ingrese residencia: ");
                    sc.nextLine();
                    String residencia = sc.nextLine();
                    System.out.println("Que es la persona?");
                    System.out.println("1. Empleado");
                    System.out.println("2. Cliente");
                    int op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Que tipo de empleado es?");
                            System.out.println("1. empleado de carga");
                            System.out.println("2. empleado de seguridad;");
                            int p = sc.nextInt();
                            switch (p) {
                                case 1:
                                    System.out.println("hora de entrada");
                                    int hora = sc.nextInt();
                                    System.out.println("Hora de salida");
                                    int hora2 = sc.nextInt();
                                    System.out.println("Ingrese año, mes, y dia");
                                    int año = sc.nextInt();
                                    int mes = sc.nextInt();
                                    int dia = sc.nextInt();
                                    Calendar c = new GregorianCalendar(año, mes, dia);

                                    empleados.add(new empleado_carga(hora, hora2, c, sueldo, nombre, id, edad, altura, peso, residencia));
                                    break;
                                case 2:
                                    System.out.println("Contraseña: ");
                                    String contra = sc.next();
                                    System.out.println("Clave: ");
                                    String clave = sc.next();
                                    System.out.println("Dia que trabaja");
                                    String diat = sc.next();
                                    empleados.add(new empleado_seguridad(clave, diat, sueldo, nombre, id, edad, altura, peso, residencia));
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("dinero en el bolsillo: ");
                            double dinero = sc.nextDouble();
                            System.out.println("");
                            System.out.println("Ingrese año, mes, y dia");
                            int año = sc.nextInt();
                            int mes = sc.nextInt();
                            int dia = sc.nextInt();
                            Calendar c = new GregorianCalendar(año, mes, dia);
                            System.out.println("Productos comprados: ");
                            int producto = sc.nextInt();
                            clientes.add(new cliente(dinero,c,producto,nombre,id,edad,altura,peso,residencia));

                            break;
                    }

                    break;
                case 2:
                    System.out.println("productos");
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
            }

        } while (opcion != 6);

    }

}
