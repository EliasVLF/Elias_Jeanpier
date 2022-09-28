/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import model.ModelImplements;
import model.ModelImplementsFile;
import vista.ViewImplementation;
import java.util.ResourceBundle;
import vista.View;
/**
 *
 * @author 2dam
 */
public class ViewFactory {
   public static String rb = ResourceBundle.getBundle("elias_jeanpierr_reto0.model.config").getString("vista");
    /**
     * Al igual que la factoria del modelo se le envia por parametro un String que buscara si se encuentra en el archivo
     * @param tipo
     * @return Devuelve la implementacion de la vista
     */
    public static View getView(String tipo) {
        if (tipo.equals(rb)) {
            return new ViewImplementationText();
	}else{
            return new ViewImplementation();
        }
    }
}
