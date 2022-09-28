/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Model;
import model.ModelFactory;
import vista.View;
import vista.ViewFactory;

/**
 *
 * @author 2dam
 */
public class App extends Application{

    
    
    @Override
    public void start(Stage primaryStage) {
      try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/vista/ViewFXML.fxml"));
            Pane ventana = (Pane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(ventana);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
        
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner sc = new Scanner(System.in);
         Model model = ModelFactory.getModel("lectura");
        View view = ViewFactory.getView("visualizacion");
        
       Controller ct = new Controller();
       ct.run(model, view);
           
    }
     

}
