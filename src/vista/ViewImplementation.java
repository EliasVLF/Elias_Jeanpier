/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class ViewImplementation extends Application implements View{

    @Override
    public void showSaludo() {
        Application.launch();
    }
    
    @Override
    public void start(Stage primaryStage) {
      try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ViewImplementation.class.getResource("/vista/Viewfx.fxml"));
            
            Pane ventana = (Pane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(ventana);
            
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



    
}
