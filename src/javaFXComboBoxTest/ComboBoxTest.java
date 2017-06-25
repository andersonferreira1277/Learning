/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXComboBoxTest;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class ComboBoxTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //layout
        FlowPane root = new FlowPane();
        //cena
        Scene scene = new Scene(root, 300, 300);
        //no
        ObservableList<String> items = FXCollections.observableArrayList("Anderson", "Juliana");
        ComboBox comboBox = new ComboBox(items);
        comboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                System.out.println(newValue);
            }
        });
        //adiocionar o no
        root.getChildren().add(comboBox);

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
