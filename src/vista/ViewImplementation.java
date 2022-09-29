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
     * showGreeting Gracias al root se consigue añadir el mensaje al text Se
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

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Javafx RETO0");
        stage.setScene(scene);
        stage.show();

    }

}
