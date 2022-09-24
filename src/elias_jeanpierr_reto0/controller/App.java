/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elias_jeanpierr_reto0.controller;

import elias_jeanpierr_reto0.model.ModelFactory;
import elias_jeanpierr_reto0.model.ModelInterface;
import elias_jeanpierr_reto0.ui.ViewFactory;
import elias_jeanpierr_reto0.ui.ViewInterface;

/**
 *
 * @author 2dam
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner sc = new Scanner(System.in);
        ModelInterface model = ModelFactory.getModel();
        ViewInterface view = ViewFactory.getView();
        
       Controller ct = new Controller();
       ct.run(model, view);
           
    }
    
}
