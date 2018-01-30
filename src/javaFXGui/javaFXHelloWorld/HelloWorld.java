/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXGui.javaFXHelloWorld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        //layout
        FlowPane root = new FlowPane();      
        //cena
        Scene scene = new Scene(root, 300, 300);
        //no
        Label label = new Label("Hello World!!!");
        Button button = new Button("Botão");
        button.setOnAction(new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");}
        });
//        button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent> () {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World");
//            }
//        });
        
        //adiocionar o no
        root.getChildren().add(label);
        root.getChildren().add(button);
        
        //adicionar ao palco
        primaryStage.setScene(scene);
        
        //exibir o palco
        primaryStage.setTitle("Hello World");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
