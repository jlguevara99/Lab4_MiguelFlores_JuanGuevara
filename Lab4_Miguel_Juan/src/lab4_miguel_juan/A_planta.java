/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_miguel_juan;

/**
 *
 * @author HP
 */
public class A_planta extends Complejo {

    private int numeroP;

    public String[][] cifrado_riel(String contraseña) {
        String[][] incriptado = new String[contraseña.length() - 1][contraseña.length()];
        for (int i = 0; i < contraseña.length() - 1; i++) {
            for (int j = 0; j < contraseña.length(); j++) {
                char y = contraseña.charAt(i + 1);
                char vacio = '-';
                if (i == j) {
                    incriptado[i][j] += y;
                } else {
                    incriptado[i][j] += vacio;
                }
                if (i == contraseña.length() - 1 && j == contraseña.length() - 1) {
                    incriptado[i - 1][j + 1] += y;
                } else {
                    incriptado[i][j] += vacio;
                }
            }
        }
        return incriptado;
    }

    public String[][] cifrado_transposicion(String clave, String contraseña) {
        
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

    @Override
    public String[][] cifrado_riel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[][] cifrado_transposicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
