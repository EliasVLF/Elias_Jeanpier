/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;



/**
 * Implementacion de la vista
 * @author Elias
 */
public class ViewImplementationText implements View{
     /**
     * Este metodo obtiene el saludo que lee de un archivo de propiedades y lo muestra.
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}
