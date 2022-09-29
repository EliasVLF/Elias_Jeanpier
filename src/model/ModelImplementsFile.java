/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Implementacion lectura de un archivo de propiedades
 *
 * @author Elias
 *
 */
public class ModelImplementsFile implements Model {

    /**
     * Este metodo obtiene el saludo que lee de un archivo de propiedades.
     *
     * @return Devuelve el saludo
     */
    @Override
    public String getGreeting() {
        ResourceBundle rb = ResourceBundle.getBundle("model.Saludo");
        String greeting = rb.getString("mensaje");
        return greeting;
    }
}
