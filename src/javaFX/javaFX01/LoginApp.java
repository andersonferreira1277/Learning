package javaFX.javaFX01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(400, 300);

        TextField txLogin = new TextField();
        txLogin.setPromptText("Login");


        PasswordField pwSenha = new PasswordField();
        pwSenha.setPromptText("Digite aqui sua senha");

        Button btnEntar = new Button("Entrar");

        Button btnSair = new Button("Sair");

        pane.getChildren().addAll(txLogin, pwSenha, btnEntar, btnSair);

        Scene cena = new Scene(pane);

        primaryStage.setScene(cena);
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.show();

        txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
        txLogin.setLayoutY(50);

        pwSenha.setLayoutX((pane.getWidth() - pwSenha.getWidth())/2);
        pwSenha.setLayoutY(80);

        btnEntar.setLayoutX((pane.getWidth() - btnEntar.getWidth())/2);
        btnEntar.setLayoutY(110);

        btnSair.setLayoutX((pane.getWidth() - btnSair.getWidth())/2);
        btnSair.setLayoutY(140);

        pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% " +
                "to 100% 100%, blue 0%, silver 100%);");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
