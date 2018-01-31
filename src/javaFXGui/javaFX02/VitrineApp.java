package javaFXGui.javaFX02;

import java.util.Observable;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VitrineApp extends Application{
	
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
		
		tbVitrine.getColumns().addAll(columnProduto, columnPreco);
		
		pane.getChildren().addAll(txPesquisa, tbVitrine);
		
		carrinho = new Carrinho();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
