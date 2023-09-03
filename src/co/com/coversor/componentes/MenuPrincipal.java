package co.com.coversor.componentes;

import javax.swing.*;

public class MenuPrincipal extends JFrame {
    private JLabel label1;
    private JComboBox menu;
    private JButton botonAceptar;
    private JButton botonCancelar;

    public MenuPrincipal() {
        //Ajustes generales de la interfaz
        setLayout(null);
        setSize(300,160);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Conversor Challenge");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Ajustes JLabel
        label1 = new JLabel("Seleccione una opción de conversión ");
        label1.setBounds(15, 12, 250, 20);
        add(label1);

        //Ajustes JComboBox
        menu = new JComboBox();
        menu.setBounds(15, 38, 260, 25);
        add(menu);

        //Agregando items al JComboBox
        menu.addItem("Conversor de moneda");
        menu.addItem("Conversor de temperatura");

        //Ajustes JButton
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(50,75,85,25);
        add(botonAceptar);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(150,75,85,25);
        add(botonCancelar);
    }

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }
}
