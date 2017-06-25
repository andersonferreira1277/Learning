/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXListViewTest;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javaFXClasses.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class FXMLListViewController implements Initializable {

    @FXML
    private Button buttonRemover;
    
    @FXML
    private ListView<Cliente> listViewClientes; 
    
    @FXML
    private Label labelCliente = new Label();
    
    private List<Cliente> listClientes;

    private ObservableList<Cliente> observableListClientes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarListView ();
        listViewClientes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {selecionarItemListView();
        });
    }    
    
    public void carregarListView () {
        Cliente a = new Cliente("Anderson", "1111-2222");
        Cliente b = new Cliente("Juliana", "3333-4444");
        Cliente c = new Cliente("Lina", "5555-6666");
        listClientes = new ArrayList();
        listClientes.add(a);
        listClientes.add(b);
        listClientes.add(c);
        
        observableListClientes = FXCollections.observableArrayList(listClientes);
        
        listViewClientes.setItems(observableListClientes);
    }
    
    @FXML
    public void selecionarItemListView( ) {
        Cliente c = listViewClientes.getSelectionModel().getSelectedItem();
        labelCliente.setText("Nome: " + c.getNome() + " - Telefone: " + c.getTelefone());
    }
    
    @FXML
    public void removerCliente () {
        observableListClientes.remove(listViewClientes.getSelectionModel().getSelectedItem());
        listClientes.remove(listViewClientes.getSelectionModel().getSelectedItem());
    }
}
