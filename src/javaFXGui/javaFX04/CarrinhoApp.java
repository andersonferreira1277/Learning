package javaFXGui.javaFX04;

import javaFXGui.javaFX04.VitrineApp.ItensProperty;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CarrinhoApp extends Application {
	
	private Scene cena;
	private AnchorPane pane;
	private TableView<ItensProperty> tbCarrinho;
	private TableColumn<ItensProperty, String> columnProduto;
	private TableColumn<ItensProperty, Double> columnPreco;
	private Button btnExcluirItem, btnVoltarVitrine, btnConfirmarCompra;
	private static ObservableList<ItensProperty> listaItens;

	@Override
	public void start(Stage primaryStage) throws Exception {
		initComponents();
		initListeners();
		
		primaryStage.setScene(cena);
		primaryStage.setTitle("Hello JavaFX");
		primaryStage.show();
	}
	
	public void initComponents() {
		pane = new AnchorPane();
		
		cena = new Scene(pane);
		
		tbCarrinho = new TableView<ItensProperty>();
		
		columnProduto = new TableColumn<ItensProperty, String>("Produto");
		
		columnPreco = new TableColumn<ItensProperty, Double>("Preco");
		
		
	}
	
	public void initListeners() {
		
	}

}
