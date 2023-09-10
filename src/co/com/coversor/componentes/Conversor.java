package co.com.coversor.componentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Conversor extends JFrame implements ActionListener, ItemListener {
    protected JLabel label1;
    protected JComboBox menu;
    protected JButton botonAceptar;
    protected JButton botonCancelar;

    public Conversor() {
        //Ajustes generales de la interfaz
        setLayout(null);
        setResizable(false);
        setSize(400,160);
        setLocationRelativeTo(null);
        setTitle("Conversor Challenge");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Ajustes JLabel
        label1 = new JLabel("Seleccione una opción de conversión");
        label1.setBounds(80, 12, 250, 20);
        add(label1);

        //Ajustes JComboBox
        menu = new JComboBox();
        menu.setBounds(64, 38, 260, 25);
        menu.addItem("Conversor de monedas");
        menu.addItem("Conversor de temperatura");
        add(menu);

        //Agregando eventos al menú
        menu.addItemListener(this);

        //Ajustes JButton
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(100,75,85,25);
        add(botonAceptar);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(200,75,85,25);
        add(botonCancelar);

        //Agregando eventos a los botones
        botonAceptar.addActionListener(this);
        botonCancelar.addActionListener(this);
    }


    //Configurando la funcionalidad de la lista
    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    //Configurando la funcionalidad de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        //Validando que botón fue clickeado
        if (e.getSource() == botonAceptar) {

            //Validando que opción fue seleccionada al cliclear aceptar
            String seleccion = menu.getSelectedItem().toString();

            if (seleccion.equals("Conversor de moneda")) {
                String[] opcionesMonedas = {
                        "De Pesos a Dolar",
                        "De Pesos a Euro",
                        "De Pesos a Libras",
                        "De Pesos a Yen",
                        "De Pesos a Won Coreano",
                        "De Dolar a Pesos",
                        "De Euro a Pesos",
                        "De Libras a Pesos",
                        "De Yen a Pesos",
                        "De Won Coreano a Pesos"
                };

                //Ventana emergente con las opciones de conversion de monedas
                String seleccionMoneda = (String) JOptionPane.showInputDialog(null,
                        "Elija la moneda que desea convertir",
                        "Conversión de monedas",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcionesMonedas,
                        opcionesMonedas[0]);

                switch (seleccionMoneda) {
                    case "De Pesos a Dolar":
                        double pesosDolar = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        double tasaCambio = 0.0002489;
                        break;
                    case "De Pesos a Euro":
                        double pesosEuro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "De Pesos a Libras":
                        double pesosLibras = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "De Pesos a Yen":
                        double pesosYen = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "De Pesos a Won Coreano":
                        double pesosWon = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "De Dolar a Pesos":
                        double dolarPesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "De Euro a Pesos":
                        double euroPesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "De Libras a Pesos":
                        double librasPesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "De Yen a Pesos":
                        double yenPesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "De Won Coreano a Pesos":
                        double wonPesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                }
            } else {
                String[] opcionesTemperatura = {
                        "Grados Celcius a Grados Farenheit",
                        "Grados Celcius a Grados Kelvin",
                        "Grados Farenheit a Grados Celcius",
                        "Grados Kelvin a Grados Celcius",
                        "Grados Kelvin a Grados Farenheit"
                };

                //Ventana emergente con las opciones de conversion de monedas
                String seleccionTemperatura = (String) JOptionPane.showInputDialog(null,
                        "Elija la moneda que desea convertir",
                        "Conversión de monedas",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcionesTemperatura,
                        opcionesTemperatura[0]);

                switch (seleccionTemperatura) {
                    case "Grados Celcius a Grados Farenheit":
                        double celciusFarenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "Grados Celcius a Grados Kelvin":
                        double celciusKelvin = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "Grados Farenheit a Grados Celcius":
                        double farenheitCelcius = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "Grados Kelvin a Grados Celcius":
                        double kelvinCelcius = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                    case "Grados Kelvin a Grados Farenheit":
                        double kelvinFarenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        break;
                }
            }
        } else if (e.getSource() == botonCancelar) {
            JOptionPane.showMessageDialog(null, "Cancelando operación");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Conversor menuPrincipal = new Conversor();
        menuPrincipal.setVisible(true);
    }

}
