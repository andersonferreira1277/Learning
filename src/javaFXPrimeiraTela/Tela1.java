package javaFXPrimeiraTela;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Tela1 extends Application{
	
	private Scene cena; // Scene
	private AnchorPane anchorPane; //Layout
	private Label label;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Stage
		//Scene
		//Layout 
		label = new Label("Anderson");
		label.setLayoutX(200);
		label.setLayoutY(200);
		
		anchorPane = new AnchorPane();
		anchorPane.prefHeight(800);
		anchorPane.prefWidth(800);
		
		anchorPane.getChildren().add(label);
		
		cena = new Scene(anchorPane);
		
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
