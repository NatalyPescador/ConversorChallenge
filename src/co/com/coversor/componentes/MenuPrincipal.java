package co.com.coversor.componentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MenuPrincipal extends JFrame {
    Menus menu1 = new Menus("Seleccione una opción de conversión");

    public MenuPrincipal() {
        //Agregando items y eventos al menu principal
        menu1.addNewItem("Conversor de moneda");
        menu1.addNewItem("Conversor de temperatura");

        //Agregando eventos a los botones
/*        menu1.botonAceptar.addActionListener(this);
        menu1.botonCancelar.addActionListener(this);*/
    }

    //Configurando la funcionalidad de los botones


    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
    }
    
}
