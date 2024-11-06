package com.devcoder.login;

import javax.swing.UIManager;
import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;
import com.devcoder.login.igu.LoginInicial;

public class Login {

    public static void main(String[] args){
        
        try {
            // Setear el Look and Feel
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "El Look And Feel no ha sido instalado o no es compatible con la versión de java que estás utilizando.", "Error con Look And Feel", JOptionPane.ERROR_MESSAGE);
        }

        //  Hacer visible la IGU de Login
        LoginInicial princ = new LoginInicial();
        princ.setTitle("Login by Lautaro Petelin");
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}