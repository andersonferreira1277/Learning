/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXGui.javaFXTela1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 278,130);
        //Adicionando os nós
        Label labelLogin = new Label("Login: ");
        labelLogin.setLayoutX(38);
        labelLogin.setLayoutY(36);
        Label labelSenha = new Label("Senha: ");
        labelSenha.setLayoutX(38);
        labelSenha.setLayoutY(65);
        TextField textFieldLogin = new TextField("Digite seu login");
        textFieldLogin.setLayoutX(88);
        textFieldLogin.setLayoutY(32);
        PasswordField passwordFieldSenha = new PasswordField();
        passwordFieldSenha.setLayoutX(88);
        passwordFieldSenha.setLayoutY(61);
        Button buttonAcessar = new Button("Acessar");
        buttonAcessar.setLayoutX(113);
        buttonAcessar.setLayoutY(91);
        
        //Adicionando um observer o subject
        buttonAcessar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        //Adicionando os nós
        root.getChildren().addAll(labelLogin,labelSenha, textFieldLogin, passwordFieldSenha, buttonAcessar);
        
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
