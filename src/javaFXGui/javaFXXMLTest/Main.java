/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXGui.javaFXXMLTest;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	
    	System.out.println(getClass().getResource("FXMLTest.fxml"));
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLTest.fxml"));

        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
