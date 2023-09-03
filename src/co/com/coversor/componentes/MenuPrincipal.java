package co.com.coversor.componentes;

import javax.swing.*;

public class MenuPrincipal extends JFrame {
    private JLabel label1;
    private JComboBox comboBox1;
    private JButton boton1;
    private JButton boton2;

    public MenuPrincipal() {
        //Ajustes generales de la interfaz
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Conversor Challenge");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Ajustes JLabel
        label1 = new JLabel("Seleccione una opción de conversión ");
        label1.setBounds(60, 30, 150, 20);
        add(label1);

        //Ajustes JComboBox
        comboBox1 = new JComboBox();
        comboBox1.setBounds(60, 60, 150, 20);
        add(comboBox1);

        //Agregando items al JComboBox
        comboBox1.addItem("Conversor de moneda");
        comboBox1.addItem("Conversor de temperatura");

        //

    }
}
