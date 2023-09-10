package co.com.coversor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

public class Conversor extends JFrame implements ActionListener, ItemListener {
    protected JLabel label1;
    protected JComboBox menu;
    protected JButton botonAceptar;
    protected JButton botonCancelar;

    public Conversor() {
        //Ajustes generales de la interfaz
        setLayout(null);
        setResizable(false);
        setSize(300,160);
        setLocationRelativeTo(null);
        setTitle("Conversor Challenge");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Ajustes JLabel
        label1 = new JLabel("Seleccione una opción de conversión");
        label1.setBounds(15, 12, 250, 20);
        add(label1);

        //Ajustes JComboBox
        menu = new JComboBox();
        menu.setBounds(15, 38, 260, 25);
        menu.addItem("Conversor de moneda");
        menu.addItem("Conversor de temperatura");
        add(menu);

        //Agregando eventos al menú
        menu.addItemListener(this);

        //Ajustes JButton
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(50,75,85,25);
        add(botonAceptar);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(150,75,85,25);
        add(botonCancelar);

        //Agregando eventos a los botones
        botonAceptar.addActionListener(this);
        botonCancelar.addActionListener(this);
    }

    //Creando función principal de conversión de moneda
    public static void conversionMoneda(double tasa) {
        //Solicitar el valor al usuario
        int cantidad = 0;
        try {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Recuerde que debe ingresar una opción valida, es decir una opción númerica");
        }

        //Realizar la conversión
        double resultado = cantidad * tasa;

        //Dar formato al resultado para generar una correcta conversión
        DecimalFormat formato = new DecimalFormat("#.##");
        String conversion = formato.format(resultado);

        //Mostrar la conversion al usuario
        JOptionPane.showMessageDialog(null, cantidad + " es igual a " + conversion);
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

            //Opciones de conversion de moneda
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

                //Ejecución de la respectiva conversión dependiendo de la opción seleccionada
                switch (seleccionMoneda) {
                    case "De Pesos a Dolar" -> conversionMoneda(0.0002489);
                    case "De Pesos a Euro" -> conversionMoneda(0.00023);
                    case "De Pesos a Libras" -> conversionMoneda(0.00020);
                    case "De Pesos a Yen" -> conversionMoneda(0.037);
                    case "De Pesos a Won Coreano" -> conversionMoneda(0.33);
                    case "De Dolar a Pesos" -> conversionMoneda(4018.67);
                    case "De Euro a Pesos" -> conversionMoneda(4305.40);
                    case "De Libras a Pesos" -> conversionMoneda(5009.27);
                    case "De Yen a Pesos" -> conversionMoneda(27.19);
                    case "De Won Coreano a Pesos" -> conversionMoneda(3.01);
                    default -> JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción válida");
                }

                //Validar si el usuario desea realizar una nueva conversión
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

                switch (confirmacion) {
                    case JOptionPane.NO_OPTION, JOptionPane.CANCEL_OPTION, JOptionPane.CLOSED_OPTION -> {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        System.exit(0);
                    }
                }
            } else if (seleccion.equals("Conversor de temperatura")) {
              //Opciones de conversion de temperatura
                String[] opcionesTemperatura = {
                        "Grados Celcius a Grados Fahrenheit",
                        "Grados Celcius a Grados Kelvin",
                        "Grados Fahrenheit a Grados Celcius",
                        "Grados Kelvin a Grados Celcius",
                        "Grados Kelvin a Grados Fahrenheit"
                };

                //Ventana emergente con las opciones de conversion de monedas
                String seleccionTemperatura = (String) JOptionPane.showInputDialog(null,
                        "Elija la temperatura que desea convertir",
                        "Conversión de temperatura",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcionesTemperatura,
                        opcionesTemperatura[0]);

                switch (seleccionTemperatura) {
                    case "Grados Celcius a Grados Fahrenheit" -> {
                        double celsiusF = 0;
                        try {
                            celsiusF = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Recuerde que debe ingresar una opción valida, es decir una opción númerica");
                            break;
                        }
                        double celsiusAFahrenheit = (celsiusF * 9 / 5) + 32;
                        JOptionPane.showMessageDialog(null, celsiusF + " Grados Celsius son " + celsiusAFahrenheit + " Grados Fahrenheit");
                    }
                    case "Grados Celcius a Grados Kelvin" -> {
                        double celsiusK = 0;
                        try {
                            celsiusK = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Recuerde que debe ingresar una opción valida, es decir una opción númerica");
                            break;
                        }
                        double celsiusAKelvin = celsiusK + 273.15;
                        JOptionPane.showMessageDialog(null, celsiusK + " Grados Celsius son " + celsiusAKelvin + " Grados Kelvin");
                    }
                    case "Grados Fahrenheit a Grados Celcius" -> {
                        double fahrenheitC = 0;
                        try {
                            fahrenheitC = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Recuerde que debe ingresar una opción valida, es decir una opción númerica");
                            break;
                        }
                        double fahrenheitACelsius = (fahrenheitC - 32) * 5 / 9;
                        JOptionPane.showMessageDialog(null, fahrenheitC + " Grados Fahrenheit son " + fahrenheitACelsius + " Grados Celsius");
                    }
                    case "Grados Kelvin a Grados Celcius" -> {
                        double kelvinC = 0;
                        try {
                            kelvinC = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Recuerde que debe ingresar una opción valida, es decir una opción númerica");
                            break;
                        }
                        double kelvinACelsius = kelvinC - 273.15;
                        JOptionPane.showMessageDialog(null, kelvinC + " Grados Kelvin son " + kelvinACelsius + " Grados Celsius");
                    }
                    case "Grados Kelvin a Grados Fahrenheit" -> {
                        double kelvinF = 0;
                        try {
                            kelvinF = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Recuerde que debe ingresar una opción valida, es decir una opción númerica");
                            break;
                        }
                        double kelvinAFahrenheit = (kelvinF - 273.15) * 9 / 5 + 32;
                        JOptionPane.showMessageDialog(null, kelvinF + " Grados Kelvin son " + kelvinAFahrenheit + " Grados Fahrenheit");
                    }
                    default -> JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción válida");
                }
                //Validar si el usuario desea realizar una nueva conversión
                int confirmacionContinuar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?","Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

                switch (confirmacionContinuar) {
                    case JOptionPane.NO_OPTION, JOptionPane.CANCEL_OPTION,JOptionPane.CLOSED_OPTION -> {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        System.exit(0);
                    }
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
