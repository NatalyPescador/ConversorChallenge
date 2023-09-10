package co.com.coversor.componentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MenuPrincipal extends JFrame implements ActionListener, ItemListener {
    Menus menuPrincipal = new Menus("Seleccione una opción de conversión");

    public MenuPrincipal() {
        //Agregando items y eventos al menu principal
        menuPrincipal.addNewItem("Conversor de moneda");
        menuPrincipal.addNewItem("Conversor de temperatura");

        //Agregando eventos a los botones
        menuPrincipal.botonAceptar.addActionListener(this);
        menuPrincipal.botonCancelar.addActionListener(this);

        //Agregando eventos al menú
        menuPrincipal.menu.addItemListener(this);
    }

    //Configurando la funcionalidad de la lista
    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    //Configurando la funcionalidad de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        //Validando que botón fue clickeado
        if (e.getSource() == menuPrincipal.botonAceptar) {

            //Validando que opción fue seleccionada al cliclear aceptar
            String seleccion = menuPrincipal.menu.getSelectedItem().toString();

            if (seleccion.equals("Conversor de moneda")) {
                //Creando un nuevo menú para la lista de conversion de monedas
                Menus conversorMoneda = new Menus("Elija la moneda a la que desea convertir");

                //Agregando nuevo items de cada una de las opciones de conversion
                conversorMoneda.addNewItem("De Pesos a Dolar");
                conversorMoneda.addNewItem("De Pesos a Euro");
                conversorMoneda.addNewItem("De Pesos a Libras");
                conversorMoneda.addNewItem("De Pesos a Yen");
                conversorMoneda.addNewItem("De Pesos a Won Coreano");
                conversorMoneda.addNewItem("De Dolar a Pesos");
                conversorMoneda.addNewItem("De Euro a Pesos");
                conversorMoneda.addNewItem("De Libras a Pesos");
                conversorMoneda.addNewItem("De Yen a Pesos");
                conversorMoneda.addNewItem("De Won Coreano a Pesos");

                //Agregando funcionalidad al boton aceptar
                conversorMoneda.botonAceptar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == conversorMoneda.botonAceptar) {
                            String seleccionMoneda = conversorMoneda.menu.getSelectedItem().toString();
                            switch (seleccionMoneda) {
                                case "De Pesos a Dolar":
                                    int pesosDolar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Pesos a Euro":
                                    int pesosEuro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Pesos a Libras":
                                    int pesosLibras = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Pesos a Yen":
                                    int pesosYen = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Pesos a Won Coreano":
                                    int pesosWon = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Dolar a Pesos":
                                    int dolarPesos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Euro a Pesos":
                                    int euroPesos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Libras a Pesos":
                                    int librasPesos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Yen a Pesos":
                                    int yenPesos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                                case "De Won Coreano a Pesos":
                                    int wonPesos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor que desea convertir"));
                                    break;
                            }
                        }
                    }
                });

                //Agregando funcionalidad al boton cancelar
                conversorMoneda.botonCancelar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == conversorMoneda.botonCancelar) {
                            System.exit(0);
                        }
                    }
                });


            } else {
                //Creando un nuevo menú para la lista de conversion de temperatura
                Menus conversorTemperatura = new Menus("Elija la temperatura a la que desea convertir");

                //Agregando funcionalidad a los botones del nuevo menu

                //Agregando funcionalidad a la lista del nuevo menu

                //Agregando nuevo items de cada una de las opciones de conversion
                conversorTemperatura.addNewItem("Grados Celcius a Grados Farenheit");
                conversorTemperatura.addNewItem("Grados Celcius a Grados Kelvin");
                conversorTemperatura.addNewItem("Grados Farenheit a Grados Celcius");
                conversorTemperatura.addNewItem("Grados Kelvin a Grados Celcius");
                conversorTemperatura.addNewItem("Grados Kelvin a Grados Farenheit");
                String seleccionTemperatura = conversorTemperatura.menu.getSelectedItem().toString();
            }
        } else if (e.getSource() == menuPrincipal.botonCancelar) {
            JOptionPane.showMessageDialog(null, "Cancelando operación");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
    }

}
