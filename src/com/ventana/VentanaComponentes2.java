package com.ventana;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author acabezaslopez
 */
public class VentanaComponentes2 {

    JFrame marco;
    JPanel panel;
    JLabel etUsuario, etContrasinal;
    JButton boton1, blimpar;
    JTextField jtUsuario;
    JPasswordField jtContrasinal;

    public VentanaComponentes2() {
        marco = new JFrame("**** VentanaComponentes2 ****");
        panel = new JPanel();
        etUsuario = new JLabel("Usuario");
        etContrasinal = new JLabel("Contrasinal");
        boton1 = new JButton("inxire");
        blimpar = new JButton("limpa");
        jtUsuario = new JTextField(10);
        jtContrasinal = new JPasswordField(6);

        etUsuario.setBounds(0, 100, 120, 20);
        panel.add(etUsuario);
        jtUsuario.setBounds(60, 100, 120, 20);
        panel.add(jtUsuario);
        etContrasinal.setBounds(200, 100, 50, 20);
        panel.add(etContrasinal);
        jtContrasinal.setBounds(300, 100, 50, 20);
        panel.add(jtContrasinal);
        panel.add(boton1);
        boton1.setBounds(400, 100, 100, 30);
        panel.add(blimpar);
        blimpar.setBounds(500, 100, 100, 30);
        panel.setBackground(Color.PINK);

        panel.setLayout(null);
        boton1.setToolTipText("inxire os datos");
        blimpar.setMnemonic('1');

        marco.setSize(600, 300);
        marco.add(panel);
        //marco.pack();
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
