/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ResourceBundle;
import static vista.ViewFactory.rb;

/**
 *
 * @author 2dam
 */
public class ViewImplementationText implements View{

    
        public static ResourceBundle rb = ResourceBundle.getBundle("model.Saludo");
        
    @Override
    public void showSaludo() {
        System.out.print(rb.getString("mensaje"));
    }

}
