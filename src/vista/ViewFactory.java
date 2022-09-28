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
import model.Model;
/**
 *
 * @author 2dam
 */
public class ViewFactory {
    public static ResourceBundle rb = ResourceBundle.getBundle("elias_jeanpierr_reto0.model.config");
    public static View getModel() {
       Integer modo = Integer.parseInt(rb.getString("modo"));
        if (modo == 1) {
            return new ViewImplementationText();
	}else{
            return new ViewImplementation();
        }
    }
}
