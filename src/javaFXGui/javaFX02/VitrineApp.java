package javaFXGui.javaFX02;

import java.util.Observable;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VitrineApp extends Application{
	
	private Scene cena;
	private AnchorPane pane;
	private TextField txPesquisa;
	private TableView<ItensProperty> tbVitrine;
	private TableColumn<ItensProperty, String> columnProduto;
	private TableColumn<ItensProperty, Double> columnPreco;
	private static ObservableList<ItensProperty> listaItens = FXCollections.observableArrayList();
	private static Carrinho carrinho;
	
	public class ItensProperty{
		
		private SimpleStringProperty produto;
		private SimpleDoubleProperty preco;
		
		public ItensProperty(String produto, Double preco) {
			this.produto = new SimpleStringProperty(produto);
			this.preco = new SimpleDoubleProperty(preco);
		}
		
		public String getProduto() {
			return this.produto.get();
		}
		
		public void setProduto(String produto) {
			this.produto.set(produto);
		}
		
		public double getPreco() {
			return this.preco.get();
		}
		
		public void setPreco(double preco) {
			this.preco.set(preco);
		}
		
	}
	
	public void initComponets() {
		
		pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		
		txPesquisa = new TextField();
		txPesquisa.setText("Digite um item para pesquisa");
		
		tbVitrine = new TableView<ItensProperty>();
		tbVitrine.setPrefSize(780, 550);
		
		columnProduto = new TableColumn<ItensProperty, String>();
		
		columnPreco = new TableColumn<ItensProperty, Double>();
		
		columnProduto.setCellValueFactory(new PropertyValueFactory<ItensProperty, String>("Produto"));
		
		columnPreco.setCellValueFactory(new PropertyValueFactory<ItensProperty, Double>("Preço"));
		
		tbVitrine.getColumns().addAll(columnProduto, columnPreco);
		
		pane.getChildren().addAll(txPesquisa, tbVitrine);
		
		carrinho = new Carrinho();
		
		tbVitrine.setItems(listaItens);
		
		cena = new Scene(pane);
		
	}
	
	public void initItens() {
		
		Vitrine v = new Vitrine();
		v.addProduto(new Produto("Bola Topper", 15.00), new Produto("Luvas Umbro", 9.00), 
				new Produto("Camisa Esportiva", 40.00),new Produto("Chuteira Nike Mercurial", 199.00), 
				new Produto("Caneleira Topper", 10.00));
		for (Produto p : v.getProdutos()) {
			listaItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		initComponets();
		initItens();
		
		primaryStage.setScene(cena);
		primaryStage.setTitle("Hello JavaFX");
		primaryStage.show();
		
	}

}
