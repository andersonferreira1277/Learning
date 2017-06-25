/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXKeyEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class TestKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        

        //layout
        FlowPane root = new FlowPane();
        //cena
        Scene scene = new Scene(root, 300, 300);
        scene.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println(event.getCharacter());
            }
        });
        //no
        
        //adiocionar o no
        

        //adicionar ao palco
        primaryStage.setScene(scene);

        //exibir o palco
        primaryStage.setTitle("Hello World");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
