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
            System.out.println("5. Eliminar empleado");
            System.out.println("6. Eliminar cliente");
            System.out.println("7. Modificar Producto");
            System.out.println("8. Eliminar Producto");
            System.out.println("9. Eliminar almacen");
            System.out.println("10. Listar");
            System.out.println("11. Transeferir");
            System.out.println("12. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    try {
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
                                clientes.add(new cliente(dinero, c, producto, nombre, id, edad, altura, peso, residencia));

                                break;
                        }
                    } catch (Exception e) {
                        System.out.println("Incorrecto, ingrese de nuevo");
                    }

                    break;
                case 2:
                    try {
                        System.out.println("productos");
                        System.out.println("Ingrese fecha de emision: ");
                        System.out.println("Ingrese año, mes, y dia");
                        int año = sc.nextInt();
                        int mes = sc.nextInt();
                        int dia = sc.nextInt();
                        Calendar c = new GregorianCalendar(año, mes, dia);

                        System.out.println("vida util: ");
                        int vida = sc.nextInt();
                        System.out.println("precio: ");
                        double p = sc.nextDouble();
                        System.out.println("tamaño: ");
                        double tam = sc.nextDouble();
                        System.out.println("descripcion: ");
                        sc.nextLine();
                        String des = sc.nextLine();
                        System.out.println("Nombre: ");
                        sc.nextLine();
                        String nom = sc.nextLine();
                        System.out.println("Numero de productos: ");
                        int pro = sc.nextInt();
                        productos.add(new Producto(c, vida, p, tam, des, nom, pro));
                    } catch (InputMismatchException e) {
                        System.out.println("Incorrecto");
                    }

                    break;
                case 3:
                    try {
                        System.out.println("Tamaño en metros: ");
                        double tam = sc.nextDouble();
                        System.out.println("Altura");
                        double alt = sc.nextDouble();
                        System.out.println("1. almacenes de planta");
                        System.out.println("2. almacenes regionales");
                        System.out.println("3. almacenes plataforma");
                        System.out.println("4. almacenes temporales");
                        
                        int planta = sc.nextInt();
                        switch (planta) {
                            case 1:
                                System.out.println("numero de plantas");
                                int plantas = sc.nextInt();
                                almacenes.add(new A_planta());
                                break;
                            case 2:
                                System.out.println("Nombre del departamento");
                                sc.nextLine();
                                String nombre = sc.nextLine();
                                almacenes.add(new A_regionales(nombre,empleados,productos,tam,alt,clientes));
                                break;
                            case 3:
                                System.out.println("Numero de personas");
                                int per = sc.nextInt();
                                almacenes.add(new A_plataforma(per,empleados,productos,tam,alt,clientes));
                                break;
                            case 4:
                                almacenes.add(new A_temporal(empleados,productos,empleados,productos,tam,alt,clientes));
                                break;
                        }
                    } catch (Exception e) {
                        System.out.println("Incorrecto");
                    }

                    break;
                case 4:
                    try {
                        System.out.println("Modificar empleado: ");
                        System.out.println("Posicion de la persona: ");
                        int pos = sc.nextInt();
                        System.out.println("1. nombre");
                        System.out.println("2. id");
                        System.out.println("3. edad");
                        System.out.println("4. altura");
                        System.out.println("5. peso");
                        System.out.println("6. residencia");
                        int caso = sc.nextInt();
                        switch (caso) {
                            case 1:
                                System.out.println("Nuevo nombre:");
                                sc.nextLine();
                                String nombre = sc.nextLine();
                                empleados.get(pos).setNombre(nombre);
                                break;
                            case 2:
                                System.out.println("Nueva id");
                                String id = sc.next();
                                empleados.get(pos).setId(id);
                                break;
                            case 3:
                                System.out.println("nueva edad");
                                int edad = sc.nextInt();
                                empleados.get(pos).setEdad(edad);
                                break;
                            case 4:
                                System.out.println("Nueva altura");
                                double altura = sc.nextDouble();
                                empleados.get(pos).setAltura(altura);
                                break;
                            case 5:
                                System.out.println("Nuevo peso");
                                altura = sc.nextDouble();
                                empleados.get(pos).setPeso(altura);
                                break;
                            case 6:
                                System.out.println("Nuevo nombre:");
                                sc.nextLine();
                                nombre = sc.nextLine();
                                empleados.get(pos).setNombre(nombre);
                                break;

                        }
                    } catch (Exception e) {
                        System.out.println("Incorrecto");
                    }

                    break;
                case 5:

                    try {
                        System.out.println("Eliminar empleado");
                        System.out.println("Ingrese la posicion: ");
                        int posicion = sc.nextInt();
                        empleados.remove(posicion);

                    } catch (Exception e) {
                        System.out.println("ES INCORRECTO");
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Eliminar cliente");
                        System.out.println("Ingrese la posicion: ");
                        int posicion = sc.nextInt();
                        clientes.remove(posicion);

                    } catch (Exception e) {
                        System.out.println("ES INCORRECTO");
                    }
                    break;
                case 7:
                    try {
                        System.out.println("Modificar producto");
                        System.out.println("Ingrese la posicion del producto");
                        int pos = sc.nextInt();
                        System.out.println("Que desea cambiar: ");
                        System.out.println("1. vida util");
                        System.out.println("2. precio");
                        System.out.println("3. tamaño");
                        System.out.println("4. descripcion");
                        System.out.println("5. nombre");
                        int op = sc.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("nueva vida util: ");
                                int vida = sc.nextInt();
                                productos.get(pos).setVida(vida);

                                break;
                            case 2:
                                System.out.println("nuevo precio");
                                double peso = sc.nextDouble();
                                productos.get(pos).setPrecio(peso);
                                break;
                            case 3:
                                System.out.println("Nuevo tamaño");
                                peso = sc.nextDouble();
                                productos.get(pos).setTamaño(peso);
                                break;
                            case 4:
                                System.out.println("nueva descripcion");
                                sc.nextLine();
                                String des = sc.nextLine();
                                productos.get(pos).setDescripcion(des);
                                break;
                            case 5:
                                System.out.println("nuevo nombre: ");
                                sc.nextLine();
                                des = sc.nextLine();
                                productos.get(pos).setNombre(des);
                                break;

                        }
                    } catch (Exception e) {
                        System.out.println("Incorrecto");
                    }

                    break;
                case 8:

                    try {
                        System.out.println("Eliminar producto");
                        System.out.println("Ingrese la posicion: ");
                        int pos = sc.nextInt();
                        productos.remove(pos);

                    } catch (Exception e) {
                        System.out.println("ES INCORRECTO");
                    }
                    break;
                case 9:
                    try {
                        System.out.println("Eliminar almacen");
                        System.out.println("Ingrese la posicion: ");
                        int pos = sc.nextInt();
                        almacenes.remove(pos);
                    } catch (Exception e) {
                        System.out.println("Incorrecto");
                    }
                    break;
                case 10:
                    System.out.println("que desea listar?");
                    System.out.println("1. empleados");
                    System.out.println("2. clientes");
                    System.out.println("3. almacenes");
                    int var = sc.nextInt();
                    switch (var) {
                        case 1:
                            for (Empleado t : empleados) {
                                System.out.println(empleados.indexOf(t)+". "+t);
                            }
                            break;
                        case 2:
                            for (cliente t : clientes) {
                                System.out.println(clientes.indexOf(t)+". "+t);
                            }
                            break;
                        case 3:
                            for (Complejo t : almacenes) {
                                System.out.println(almacenes.indexOf(t)+". "+t);
                            }
                            break;
                        
                            
                    }
                    break;
                case 11:

                    try {
                        System.out.println("Ingrese la posicion del almacen del cual desea transeferir");
                        int pos = sc.nextInt();
                        System.out.println("Ingrese la posicion del almacen al cual desea transferir los datos");
                        int pos2 = sc.nextInt();
                        almacenes.get(pos).setEmpleados(almacenes.get(pos2).getEmpleados());
                        almacenes.get(pos).setProductos(almacenes.get(pos2).getProductos());
                        
                    } catch (Exception e) {
                        System.out.println("Incorrecto");
                    }
            }

        } while (opcion != 12);

    }

}
