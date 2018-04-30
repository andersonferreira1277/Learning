package javaFXGui.tabs;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabs extends Application{

	private Scene cena;
	@FXML
	private VBox vBox;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		vBox = (VBox) FXMLLoader.load(getClass().getResource("Tabs.fxml"));
		
		cena = new Scene(vBox);
		
		primaryStage.setTitle("Tabs");
		primaryStage.setScene(cena);
		primaryStage.show();
	}

}
