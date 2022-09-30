/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.layout.StackPane;

import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class ViewImplementation extends Application implements View {

    @Override
    public void showGreeting(String greeting) {
        Application.launch(greeting);

    }

    /**
     * primero se consigue el parametro que se envia desde el metodo
     * showGreeting Gracias al root(ventana Padre) se consigue añadir el mensaje al text Se
     * crea la escena se seteacon setScene Se muestra mediante el metodo show();
     *
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        String parameter = getParameters().getRaw().get(0);
        Text greeting = new Text(parameter);
      
        StackPane root = new StackPane();
        root.getChildren().add(greeting);
        //Estilos del texto
        greeting.setFill(Color.web("#31c4de"));
        greeting.setFont(Font.font("arial",FontWeight.BOLD,FontPosture.REGULAR,40));
       
        
        Scene scene = new Scene(root, 800, 600);
        // estilos de la ventana main
        scene.setFill(Color.web("#000"));

        stage.setTitle("Javafx RETO0");
        stage.setScene(scene);
        stage.show();

    }

}
