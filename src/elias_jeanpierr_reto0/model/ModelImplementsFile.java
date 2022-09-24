/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elias_jeanpierr_reto0.model;

import elias_jeanpierr_reto0.model.ModelInterface;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelImplementsFile implements ModelInterface{

    @Override
    public String getSaludo() {
        ResourceBundle rb = ResourceBundle.getBundle("elias_jeanpierr_reto0.model.Saludo");
        String saludo = rb.getString("mensaje");
        return saludo;
    }
}
