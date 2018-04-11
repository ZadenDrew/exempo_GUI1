package com.ventana;

import javax.swing.*;

/**
 *
 * @author acabezaslopez
 */
public class VentanaComponentes {

    JFrame marco;
    JPanel panel;
    JLabel etUsuario, etContrasinal;
    JButton boton1, blimpar;
    JTextField jtUsuario;
    JPasswordField jtContrasinal;

    public VentanaComponentes() {
        marco = new JFrame("**** VentanaComponentes ****");
        panel = new JPanel();
        etUsuario = new JLabel("Usuario");
        etContrasinal = new JLabel("Contrasinal");
        boton1 = new JButton("inxire");
        blimpar = new JButton("limpa");
        jtUsuario = new JTextField(10);
        jtContrasinal = new JPasswordField(6);
        marco.setSize(600, 300);
        panel.add(etUsuario);
        panel.add(jtUsuario);
        panel.add(etContrasinal);
        panel.add(jtContrasinal);
        panel.add(boton1);
        panel.add(blimpar);
        marco.add(panel);
        marco.pack();
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}
