/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonAlert;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class ButtonAlertController implements Initializable {
    
    @FXML
    private Button button;
    
    public void clicaalerta(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info!!!!");
        alert.setHeaderText("Cabeça");
        alert.setContentText("Info!!!!!");
        alert.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
