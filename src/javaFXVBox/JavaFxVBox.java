package javaFXVBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class JavaFxVBox extends VBox implements Initializable{
	
	@FXML
    private VBox vboxMain;
	
    @FXML
    private Label label1;

    @FXML
    private Label label2;
    
    @FXML
    private Button btnAqui;
	
    
    public JavaFxVBox() {
		
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewVBox.fxml"));
    	fxmlLoader.setRoot(this);
    	fxmlLoader.setController(this);
    	try {
			fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		System.out.println("passou");
		label1.setText("teste");
	}
	
	@FXML
	public void teste() {
		if (this.getClass().equals("JavaFxVBox.JavaFxVBox")) {
			System.out.println();}
	}

}
