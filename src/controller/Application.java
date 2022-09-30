/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controller;


import model.ModelFactory;
import vista.ViewFactory;

/**
 *
 * @author DarkD
 */
public class Application {

    /**
     * Se declara las dos interfaces del modelo y vista para llamar a la
     * factoria que devuleve los objetos. Con la declaracion del controlador
     * llamaremos al metodo que se encarga de ejecutar la aplicacion pasandole
     * por parametro las dos interfaces.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        new Controller().run(ModelFactory.getModel(), ViewFactory.getView());
    }

}
