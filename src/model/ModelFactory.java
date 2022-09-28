/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.ModelImplements;
import model.ModelImplementsFile;
import java.util.ResourceBundle;
import model.Model;
/**
 *
 * @author 2dam
 */
public class ModelFactory {
    public static String rb = ResourceBundle.getBundle("elias_jeanpierr_reto0.model.config").getString("modelo");
    /**
     * El metodo getModel se le pasa por parametro un String en la que se compara con otro que se encuentra en un archivo de propiedades.
     * Si resulta que el String que se envia se encuentra en el archivo devuelve un objeto u otro.
     * @param tipo
     * @return devuelve la implementacion del modelo
     */
    public static Model getModel(String tipo) {
        if (tipo.equals(rb)) {
            return new ModelImplementsFile();
	}else{
            return new ModelImplements();
        }
    }
}
