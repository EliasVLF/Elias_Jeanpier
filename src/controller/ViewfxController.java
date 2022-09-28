/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import model.ModelImplements;

/**
 * FXML Controller class
 *
 * @author DarkD
 */
public class ViewfxController implements Initializable {

   
    private model.ModelImplements Mode;
    @FXML
    private Label labelMessage;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ModelImplements m = new ModelImplements();

        this.labelMessage.setText(m.getSaludo());
    }

}
