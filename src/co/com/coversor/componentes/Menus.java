package co.com.coversor.componentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Menus extends JFrame {
    protected JLabel label1;
    protected JComboBox menu;
    protected JButton botonAceptar;
    protected JButton botonCancelar;

    public Menus(String textoLabel) {
        //Ajustes generales de la interfaz
        setLayout(null);
        setResizable(false);
        setSize(400,160);
        setLocationRelativeTo(null);
        setTitle("Conversor Challenge");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //Ajustes JLabel
        label1 = new JLabel(textoLabel);
        label1.setBounds(80, 12, 250, 20);
        add(label1);

        //Ajustes JComboBox
        menu = new JComboBox();
        menu.setBounds(64, 38, 260, 25);
        add(menu);

        //Ajustes JButton
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(100,75,85,25);
        add(botonAceptar);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(200,75,85,25);
        add(botonCancelar);
    }

    //Agregando items al JComboBox
    public void addNewItem(String textoNewItem) {
        menu.addItem(textoNewItem);
    }
}