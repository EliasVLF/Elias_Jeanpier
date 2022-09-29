/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {

    private static Integer modoV = Integer.parseInt(ResourceBundle.getBundle("model.config").getString("modoVista"));

    /**
     * Al igual que la factoria del modelo se le envia por parametro un String
     * que buscara si se encuentra en el archivo
     *
     * @return Devuelve la implementacion de la vista
     */
    public static View getView() {
        if (modoV != 1) {
            //implemetation from FX
            return new ViewImplementation();
        } else {
            //implemetation from Console
            return new ViewImplementationText();
        }
    }
}
