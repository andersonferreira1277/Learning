/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXGui.javaFXVBoxTest;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class FXMLVBoxController implements Initializable {

    @FXML
    private MenuBar menuBarP = new MenuBar();
    
    @FXML
    private MenuItem menuItemCadastrosClientes = new MenuItem();
    
    @FXML
    private MenuItem menuItemVendasPorMes = new MenuItem();
    
    @FXML
    private AnchorPane anchorPaneInfo = new AnchorPane();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void showFXMLCadastrosClientesController () throws IOException{
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLCadastrosClientes.fxml"));
        anchorPaneInfo.getChildren().setAll(a);
    }
    
    @FXML
    public void showFXMLRelatorios () throws IOException {
     AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLRelatorios.fxml"));
        anchorPaneInfo.getChildren().setAll(a);   
    }
}
