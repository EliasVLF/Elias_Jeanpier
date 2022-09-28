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
    
    public void run(Model model, View view){
        String texto;
        texto = model.getSaludo();
        view.showSaludo(texto);
        
    }
}
