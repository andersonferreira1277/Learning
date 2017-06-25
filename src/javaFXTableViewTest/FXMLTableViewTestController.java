/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXTableViewTest;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class FXMLTableViewTestController implements Initializable {

    @FXML
    private TableView<Cliente> tableViewCliente = new TableView();
    
    @FXML
    private TableColumn<Cliente, String> tableColumnNome = new TableColumn();
    
    @FXML
    private TableColumn<Cliente, String> tableColumnTelefone = new TableColumn();
    
    @FXML
    private Button buttonAdd = new Button();
    
    private List<Cliente> listClientes;
    private ObservableList<Cliente> observableListCliente;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarTableView();
        
        tableViewCliente.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selecionarCliente();
        });
    }    
    
    public void carregarTableView () {
        tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        tableColumnTelefone.setCellValueFactory(new PropertyValueFactory<>("Telefone"));        
        
        Cliente c1 = new Cliente("Anderson", "1111-2222");
        Cliente c2 = new Cliente("Juliana", "3333-4444");
        Cliente c3 = new Cliente("Lina", "5555-6666");
        Cliente c4 = new Cliente("Drow", "7777-8888");
        
        listClientes = new ArrayList();
        listClientes.add(c1);
        listClientes.add(c2);
        listClientes.add(c3);
        listClientes.add(c4);
        
        observableListCliente = FXCollections.observableArrayList(listClientes);
        
        tableViewCliente.setItems(observableListCliente);
    }
    @FXML
    private void selecionarCliente() {
        Cliente c = tableViewCliente.getSelectionModel().getSelectedItem();
        // c é o cliente selecionado se precisar desse cliente
    }
    
    @FXML
    public void addCliente () {
        Cliente c = new Cliente("Luna", "9999-0000");
        observableListCliente.add(c);
    }
}
