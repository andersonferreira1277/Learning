/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXCanvasTest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class CanvasTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        FlowPane root = new FlowPane();
        
        Scene scene = new Scene(root);
        //criando canvas
        Canvas canvas = new Canvas(400,400);
        
        //obtendo GraphicsContext
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.strokeLine(0, 0, 200, 100);
        
        root.getChildren().add(canvas);
        
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
