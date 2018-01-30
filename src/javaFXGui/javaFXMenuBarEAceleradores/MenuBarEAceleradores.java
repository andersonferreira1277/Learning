/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXGui.javaFXMenuBarEAceleradores;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class MenuBarEAceleradores extends Application {
    @Override
    public void start(Stage primaryStage) {
        

        //layout
        BorderPane root = new BorderPane();
        //cena
        Scene scene = new Scene(root, 300, 300);
        
        //no
        MenuBar menuBar = new MenuBar();
        
        // criando o menu
        Menu menuFile = new Menu("Arquivo");
        
        //criando submenus
        MenuItem menuItemAbrir = new MenuItem("_Abrir");
        menuItemAbrir.setAccelerator(KeyCombination.keyCombination("ctrl+a"));
        
        //adicionando itens no menu
        menuBar.getMenus().add(menuFile);
        menuFile.getItems().add(menuItemAbrir);
        //adiocionar o no
        root.setTop(menuBar);

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
