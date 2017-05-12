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
public class Excepciones extends Exception {

    public Excepciones(String message) {
        super(message);
    }

    public static void excep_edad(int x) throws Excepciones {
        if (x < 18) {
            throw new Excepciones("El usurio debe ser mayor de 18 años.");
        }
    }

    public static void excep_id(String id, String id_departamento) throws Excepciones {
        id_departamento = "08";
        String id2 = "";
        for (int i = 0; i < id.length(); i++) {
            if (i < 3) {
                id2 += i;
            }
        }
        if (!id.equalsIgnoreCase(id_departamento)) {
            throw new Excepciones("Usted no puede ingresar porque su id no coincide\n"
                    + "con el numero del departamento regional");
        }
    }

    public static void clientes(int x) throws Excepciones {
        if (x < 16) {
            throw new Excepciones("numero de clientes no admitidos, ingrese mas de 15");
        }
    }
    public static void clientes(String clave, String contraseña) throws Excepciones {
        if (clave.length()!= contraseña.length()) {
            throw new Excepciones("La contraseña debe tener la misma longitud! ");
        }
    }
    
    
    

    /// InputMismatchException  este es para que no ingrese letras en vez de numeros!  
    /// InputMismatchException  este es para que no ingrese un numero muy grande! 
}
