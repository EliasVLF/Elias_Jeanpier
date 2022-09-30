/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class ModelFactory {

    private static Integer modoD = Integer.parseInt(ResourceBundle.getBundle("model.config").getString("modoDato"));

    /**
     * El metodo getModel se le pasa por parametro un String en la que se
     * compara con otro que se encuentra en un archivo de propiedades. Si
     * resulta que el String que se envia se encuentra en el archivo devuelve un
     * objeto u otro.
     *
     * @param tipo
     * @return devuelve la implementacion del modelo
     */
    public static Model getModel() {
        
        
        if (modoD == 1) {
            //implemetation from Database
            return new ModelImplements();
        } else if(modoD==0) {
            //implemetation from File
            return new ModelImplementsFile();
        }else{
            JOptionPane.showMessageDialog(null, "Escoja una de las dos opciones de recoger datos dadas");
            
            return null;
        }
    }
}
