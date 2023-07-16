package sac.serplastin.util;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validaciones {

    public boolean ValidarTexto(String datos) {
        return datos.matches("[a-zA-Z]{1,5}");
    }

    public boolean ValidarNumDecimal(String datos) {
        return datos.matches("\\d{1,12}\\.\\d{0,3}");
    }

    public boolean ValidarNum(String datos) {
        return datos.matches("[0-9]{1,12}");
    }

    //VALIDACIONES CON MESAGGE DIALOG
    public void ValNumMsg(JTextField dato) {//Validaciones de numeros, max 12 ditos
        if (!ValidarNum(dato.getText().trim())) {
            if (!dato.getText().equals("")) {
                JOptionPane.showMessageDialog(dato, "Los caracteres no estan permitidos \n en este campo", "Advertencia", 0);
                dato.setText("");
            }
        }
    }

    public void ValNumDecMsg(JTextField dato) { //Validacion de numeros decimales, maximo de 5 digitos en parte decimal
        if (!dato.getText().equals("")) {
            if (!ValidarNumDecimal(dato.getText().trim())) {
                if (!ValidarNum(dato.getText().trim())) {
                    JOptionPane.showMessageDialog(dato, "Los caracteres no estan permitidos \n en este campo", "Advertencia", 0);
                    dato.setText("");
                }
            }
        }
    }
    //VALIDACIONES CON MESAGGE DIALOG

    public void ValCaracteres(JTextField dato) {//Validaciones text, sin espacios

        if (!dato.getText().equals("")) {
            if (!ValidarTexto(dato.getText().trim())) {
                JOptionPane.showMessageDialog(dato, "Los  no estan permitidos \n en este campo", "Advertencia", 0);
                dato.setText("");
            }
        }
    }
}
