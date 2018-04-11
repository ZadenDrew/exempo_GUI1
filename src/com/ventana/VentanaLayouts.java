package com.ventana;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author acabezaslopez
 */
public class VentanaLayouts {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public void distribuidorFlowLayaout() {
        marco = new JFrame();
        panel = new JPanel();
    }

    public void disBorderLayout() {
        panel.setLayout(new BorderLayout());
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.EAST);
        panel.add(boton4, BorderLayout.WEST);
        panel.add(boton5, BorderLayout.CENTER);
        panel.add(panel);
        marco.pack();       //axusto o marco as comoñentes
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    public void disBoxLayout() {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(panel);
        marco.pack();       //axusto o marco as comoñentes
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    public void disGridLayout() {
        panel.setLayout(new GridLayout(3, 2));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(panel);
        marco.pack();       //axusto o marco as comoñentes
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
     public void disCardLayout() {
        panel.setLayout(new CardLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(panel);
        marco.pack();       //axusto o marco as comoñentes
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
