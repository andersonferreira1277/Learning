/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelTexto;
    
    @FXML
    private Button buttonClickMe;
    
    @FXML
    private void clicarBotao(ActionEvent event) {
        labelTexto.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
