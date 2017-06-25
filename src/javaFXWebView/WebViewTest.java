/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXWebView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class WebViewTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        //Nó raiz
        FlowPane root = new FlowPane();
            
        Scene scene = new Scene(root, 1000, 750);
        
        //nós
        WebView webView = new WebView();
        //obter o web engine
        WebEngine webEngine = webView.getEngine();
        
        //adiciona a url
        
        webEngine.load("http://www.gosugamers.net/");
        
        ScrollPane scrollPane = new ScrollPane(webView);
        
        //adicionar a cena
        root.getChildren().add(scrollPane);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setMaximized(true);
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