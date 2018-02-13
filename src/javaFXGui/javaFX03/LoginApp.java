package javaFXGui.javaFX03;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application{
	
	private AnchorPane pane;
	private TextField txLogin;
	private PasswordField pwSenha;
	private Button btnEntar;
	private Button btnSair;
	private Scene cena;
	private static Stage stage;
	
	private void initComponents() {
		pane = new AnchorPane();
        pane.setPrefSize(400, 300);

        txLogin = new TextField();
        txLogin.setPromptText("Login");


        pwSenha = new PasswordField();
        pwSenha.setPromptText("Digite aqui sua senha");

        btnEntar = new Button("Entrar");

        btnSair = new Button("Sair");

        pane.getChildren().addAll(txLogin, pwSenha, btnEntar, btnSair);

        cena = new Scene(pane);
	}
	
	private void initLayout() {
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
	
	private void initListeners() {
		btnSair.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				fecharAplicacao();
			}
		});
		
		btnEntar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				logar();				
			}
			
		});
		pwSenha.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				logar();
			}
			
		});
	}
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	initComponents();
    	initListeners();
    	primaryStage.setScene(cena);
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.show();
        initLayout();
        LoginApp.stage = primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

	public static Stage getStage() {
		return stage;
	}
	
	private void logar() {
		if (txLogin.getText().equals("admin") && pwSenha.getText().equals("12345")) {
			try {
				new VitrineApp().start(new Stage());
				LoginApp.getStage().close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Usuario e/ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void fecharAplicacao() {
		System.exit(0);
	}

}
