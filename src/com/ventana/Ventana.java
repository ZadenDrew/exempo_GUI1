package com.ventana;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author acabezaslopez
 */
public class Ventana {

    JFrame marco;
    JPanel panel1, panel2;

    public Ventana() {
        marco = new JFrame("GUI 1");
        marco.setSize(800, 400);
        panel1 = new JPanel();
        panel2 = new JPanel();
        //características de todos los componentes
        panel1.setBounds(0, 0, 800, 150);
        panel1.setBackground(Color.cyan);
        panel2.setBounds(0, 200, 800, 150);
        panel2.setBackground(Color.PINK);
        marco.setLayout(null);
        marco.add(panel1);
        marco.add(panel2);
        // marco.setLocationRelativeTo(marco);
        //marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
