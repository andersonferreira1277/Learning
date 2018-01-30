package javaFXGui.javaFXComboBoxTest;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javaFXGui.javaFXClasses.Cliente;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class FXMLComboBoxController implements Initializable {

    @FXML
    private ComboBox<Cliente> comboBoxClientes;

    @FXML
    private Button buttonRemover;
    
    @FXML
    private Label labelInfo;

    private List<Cliente> listClientes = new ArrayList<>();

    private ObservableList<Cliente> observableListClientes;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarComboBoxClientes();
    }

    public void carregarComboBoxClientes() {
        Cliente c1 = new Cliente("Anderson", "1111-2222");
        Cliente c2 = new Cliente("Juliana", "3333-4444");
        Cliente c3 = new Cliente("Lina", "5555-6666");
        Cliente c4 = new Cliente("Drow", "7777-8888");

        listClientes.add(c1);
        listClientes.add(c2);
        listClientes.add(c3);
        listClientes.add(c4);

        observableListClientes = FXCollections.observableArrayList(listClientes);

        comboBoxClientes.setItems(observableListClientes);
    }

    @FXML
    public void selecionarItemComboBoxClientes() {
        Cliente cliente = comboBoxClientes.getSelectionModel().getSelectedItem();
        if (cliente != null) {
            System.out.println("Cliente selecionado no ComboBox: " + cliente.getNome());
            labelInfo.setText("Cliente: " + cliente.getNome() + " Telefone: " + cliente.getTelefone());
        }
    }

    @FXML
    public void removerItemComboBoxClientes() {
        Cliente cliente = comboBoxClientes.getSelectionModel().getSelectedItem();
        System.out.println("Cliente removido do ComboBox: " + cliente.getNome());
        comboBoxClientes.getItems().remove(cliente);
        observableListClientes.remove(cliente);
    }

}
