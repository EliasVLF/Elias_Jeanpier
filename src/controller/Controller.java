/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import vista.View;
import model.Model;


/**
 *
 * @author 2dam
 */
public class Controller {
    /**
     * El metodo se encarga de ejecutar las dos interfaces del modelo y vista.
     * @param model: Recoge el saludo 
     * @param view: Muestra el saludo
     */
    public void run(Model model, View view){
	view.showGreeting(model.getGreeting());
        
    }
}
