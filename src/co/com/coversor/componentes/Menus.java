package co.com.coversor.componentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Menus extends JFrame implements ActionListener, ItemListener {
    protected JLabel label1;
    protected JComboBox menu;
    protected JButton botonAceptar;
    protected JButton botonCancelar;

    public Menus(String textoLabel) {
        //Ajustes generales de la interfaz
        setLayout(null);
        setResizable(false);
        setSize(300,160);
        setLocationRelativeTo(null);
        setTitle("Conversor Challenge");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //Ajustes JLabel
        label1 = new JLabel(textoLabel);
        label1.setBounds(15, 12, 250, 20);
        add(label1);

        //Ajustes JComboBox
        menu = new JComboBox();
        menu.setBounds(15, 38, 260, 25);
        add(menu);

        //Ajustes JButton
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(50,75,85,25);
        add(botonAceptar);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(150,75,85,25);
        add(botonCancelar);
    }

    //Agregando items al JComboBox
    public void addNewItem(String textoNewItem) {
        menu.addItem(textoNewItem);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}

    /*@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu1.botonAceptar) {
            Menus menu2 = new Menus("Elija la moneda a la que desea hacer la conversión");
            menu2.addNewItem("De Pesos a Dolar");
            menu2.addNewItem("De Pesos a Euro");
            menu2.addNewItem("De Pesos a Libras");
            menu2.addNewItem("De Pesos a Yen");
            menu2.addNewItem("De Pesos a Won Coreano");
            menu2.addNewItem("De Dolar a Pesos");
            menu2.addNewItem("De Euro a Pesos");
            menu2.addNewItem("De Libras a Pesos");
            menu2.addNewItem("De Yen a Pesos");
            menu2.addNewItem("De Won Coreano a Pesos");
        } else if (e.getSource() == menu1.botonCancelar) {
            JOptionPane.showMessageDialog(null, "Cancelando operación");
            System.exit(0);
        }
    }*/
