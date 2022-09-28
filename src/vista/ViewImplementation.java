/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import vista.ViewImplementation;
import vista.ViewMain;
/**
 *
 * @author 2dam
 */
public class ViewImplementation implements View{

    @Override
    public void showSaludo(String saludo) {
        ViewMain ventana = new ViewMain();
        ventana.setVisible(true);
    }



    
}
