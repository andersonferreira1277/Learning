package javaFXVBox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainAppVbox extends Application{
	
	private VBox vBox;
	private Scene cena;

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		vBox = new JavaFxVBox();
		
		cena = new Scene(vBox);
		primaryStage.setScene(cena);
		primaryStage.show();
	}

}
