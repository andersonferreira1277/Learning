package relogio;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TelaRelogio extends Application{
	
	@FXML
	private VBox vBox;
	
	@FXML
	private Label labelTempo;
	
	private Scene cena;
	private SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss:SSS"); 

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		vBox = (VBox) FXMLLoader.load(getClass().getResource("relogioView.fxml"));
		
		ObservableList<Node> list = vBox.getChildren();
		
		for (Node i : list) {
			if (i.getId().equals("labelTempo") ) {
				System.out.println("passou");
				labelTempo = (Label) i;
			}
		}
		
		KeyFrame keyFrame = new KeyFrame(Duration.millis(200), e -> atualizaHoras());
		Timeline timeline = new Timeline(keyFrame);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
		cena = new Scene(vBox);
		
		
		primaryStage.setScene(cena);
		primaryStage.setTitle("Relógio");
		primaryStage.show();
	}
	
	public void setTempo(String tempo) {
		labelTempo.setText(tempo);
	}
	
	public String getTempo() {
		return labelTempo.getText();
	}
	
	public void atualizaHoras() {
		Date agora = new Date();
		labelTempo.setText(formatador.format(agora));
	}

}
