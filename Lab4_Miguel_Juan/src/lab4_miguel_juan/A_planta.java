/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_miguel_juan;

import java.util.Random;

/**
 *
 * @author HP
 */
public class A_planta extends Complejo {

    private int numeroP;

    @Override
    public String[][] cifrado_riel(String contraseña) {
        int contador = 0;
        String[][] incriptado = new String[contraseña.length() - 1][contraseña.length()];
        for (int i = 0; i < contraseña.length() - 1; i++) {
            for (int j = 0; j < contraseña.length(); j++) {
                char y = contraseña.charAt(contador);
                if (i == j) {
                    incriptado[i][j] = y + "";

                } else {
                    incriptado[i][j] = "*";
                }
                if (i == contraseña.length() && j == contraseña.length() - 1) {
                    incriptado[i - 1][j + 1] = y + "";
                }
            }
            contador++;
        }
        return incriptado;
    }

    @Override
    public String[][] cifrado_transposicion(String clave, String contraseña) {
        String[][] incriptado = new String[4][contraseña.length()];
        int mitad = contraseña.length();
        int contador = 0;
        for (int i = 0; i < clave.length(); i++) {
            char y = clave.charAt(i);
            char x = contraseña.charAt(i);
            incriptado[0][i] = "" + y;
            int letra1 = y - 97;
            incriptado[1][i] = "" + letra1;
            incriptado[2][i] = "" + x;
            int letra2 = (x) + letra1;
            char new_letra = (char) letra2;
            incriptado[3][i] = new_letra + "";
        }
        return incriptado;
    }

    @Override
    public String convercion_cadena_invercion(String clave, String contraseña) {
        char par = '1', impar = '0';
        String binario = "", cad_final = "";
        int n = Integer.parseInt(clave);
        while (n >= 1) {
            for (int i = 0; i < n; i++) {
                if (n % 2 == 0) {
                    binario += impar;
                    n = n / 2;
                } else {
                    binario += par;
                    n = n / 2;
                }
            }
        }
        for (int i = binario.length() - 1; i >= 0; i--) {
            cad_final += binario.charAt(i);
        }
        int n2 = Integer.parseInt(contraseña);
        while (n2 >= 1) {
            for (int i = 0; i < n2; i++) {
                if (n2 % 2 == 0) {
                    binario += impar;
                    n2 = n2 / 2;
                } else {
                    binario += par;
                    n2 = n2 / 2;
                }
            }
        }
        for (int i = binario.length() - 1; i >= 0; i--) {
            cad_final += binario.charAt(i);
        }
        String cadena_final = "";
        for (int i = cad_final.length(); i >= 0; i--) {
            cadena_final += cad_final.charAt(i);
        }
        return cadena_final;
    }

    @Override
    public String adelantar_posiciones(String contraseña) {
        Random nr = new Random();
        String cadena = "GATOS";
        String cad_final = "";
        for (int m = 0; m < cadena.length(); m++) {
            int corrimiento = 1 + nr.nextInt(9);
            cad_final = "";
            int correr;
            for (int i = 0; i < cadena.length(); i++) {
                char x = cadena.charAt(i);
                correr = (int) x;//Obtengo la letra en el numero ASCCI
                int convertidor = correr;
                for (int j = 0; j < corrimiento; j++) {
                    convertidor += 1;
                    if (convertidor == 123) {
                        convertidor = 97;
                    }
                }
                char new_letra = (char) convertidor;
                cad_final += new_letra + "";
            }
        }
        return cad_final;
    }
}
