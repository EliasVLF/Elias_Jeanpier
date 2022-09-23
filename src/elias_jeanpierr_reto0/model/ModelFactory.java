/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elias_jeanpierr_reto0.model;
import elias_jeanpierr_reto0.model.ModelImplements;
import elias_jeanpierr_reto0.model.ModelImplementsFile;
import elias_jeanpierr_reto0.model.ModelInterface;
import java.util.ResourceBundle;
/**
 *
 * @author 2dam
 */
public class ModelFactory {
    public static ResourceBundle rb = ResourceBundle.getBundle("elias_jeanpierr_reto0.model.config");
    public static ModelInterface getModel() {
       Integer modo = Integer.parseInt(rb.getString("modo"));
        if (modo == 1) {
            return new ModelImplementsFile();
	}else{
            return new ModelImplements();
        }
    }
}
