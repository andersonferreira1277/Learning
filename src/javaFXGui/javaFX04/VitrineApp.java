package javaFXGui.javaFX04;


import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
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

		@Override
		public String toString() {
			return "ItensProperty [produto=" + produto + ", preco=" + preco + "]";
		}
		
	}
	
	public void initComponets() {
		
		pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		
		txPesquisa = new TextField();
		txPesquisa.setText("Digite um item para pesquisa");
		
		tbVitrine = new TableView<ItensProperty>();
		tbVitrine.setLayoutY(35);
		tbVitrine.setLayoutX(20);
		tbVitrine.setPrefSize(760, 550);
		
		columnProduto = new TableColumn<ItensProperty, String>("Produto");
		
		columnPreco = new TableColumn<ItensProperty, Double>("Preço");
				
		tbVitrine.getColumns().addAll(columnProduto, columnPreco);
		
		pane.getChildren().addAll(txPesquisa, tbVitrine);
		
		carrinho = new Carrinho();
		
		columnProduto.setCellValueFactory(new PropertyValueFactory<ItensProperty, String>("produto"));
		columnProduto.setPrefWidth(690);
		
		columnPreco.setCellValueFactory(new PropertyValueFactory<ItensProperty, Double>("preco"));
		columnPreco.setPrefWidth(75);
		
		tbVitrine.setItems(listaItens);
		
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% " +
                "to 100% 100%, blue 0%, silver 100%);");
		
		cena = new Scene(pane);
		
	}
	
	private void initItens() {
		
		Vitrine v = new Vitrine();
		v.addProduto(new Produto("Bola Topper", 15.00), new Produto("Luvas Umbro", 9.00), 
				new Produto("Camisa Esportiva", 40.00),new Produto("Chuteira Nike Mercurial", 199.00), 
				new Produto("Caneleira Topper", 10.00));
		for (Produto p : v.getProdutos()) {
			listaItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
		}
				
	}
	
	private void initListeners() {
		txPesquisa.setOnKeyReleased(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Ativado");
				if (txPesquisa.getText().equals("")) {
					tbVitrine.setItems(listaItens);
				} else {
					tbVitrine.setItems(findItems());
				}
			}
			
		});;
		
		tbVitrine.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ItensProperty>() {

			@Override
			public void changed(ObservableValue<? extends ItensProperty> value, ItensProperty oldItem, ItensProperty newItem) {
				
				// Indicando os valores de produto e index
				ItemApp.setProduto(new Produto(newItem.getProduto(), newItem.getPreco()));
				ItemApp.setIndex(tbVitrine.getSelectionModel().getSelectedIndex());
				
				// chamando o formulario de exibição do item
				
				try {
					new ItemApp().start(new Stage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	} 
	
	public static void main(String[] args) {
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		initComponets();
		initItens();
		initListeners();
		
		primaryStage.setScene(cena);
		primaryStage.setTitle("Hello JavaFX");
		primaryStage.show();
		
	}
	
	private ObservableList<ItensProperty> findItems(){
		ObservableList<ItensProperty> itensEncontrados = FXCollections.observableArrayList();
		
		for (ItensProperty item : listaItens) {
			if (item.getProduto().contains(txPesquisa.getText())) {
				itensEncontrados.add(item);
			};
		}
		return itensEncontrados;
	}

}
