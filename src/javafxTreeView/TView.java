package javafxTreeView;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafxTreeView.TView.Employee;

public class TView extends Application{
	
	private Stage stage;
	private Scene cena;
	
	@FXML
    private VBox layout;
	
	@FXML
    private TreeTableView<Employee> tb;

    @FXML
    private TreeTableColumn<Employee, String> tcNome;

    @FXML
    private TreeTableColumn<Employee, String> tcValor;
    
    TreeItem<Employee> itens = new TreeItem<Employee>(new Employee("Anderson", 20));

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader fLoader = new FXMLLoader(getClass().getResource("tView.fxml"));
		fLoader.setController(this);
		fLoader.load();
		
		
		
		tcNome.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Employee,String>, ObservableValue<String>>() {
			
			@Override
			public ObservableValue<String> call(CellDataFeatures<Employee, String> param) {
				// TODO Auto-generated method stub
				return new ReadOnlyStringWrapper(param.getValue().getValue().getNome());
			}
		});
		tcValor.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Employee,String>, ObservableValue<String>>() {
			
			@Override
			public ObservableValue<String> call(CellDataFeatures<Employee, String> param) {
				// TODO Auto-generated method stub
				return new ReadOnlyStringWrapper(param.getValue().getValue().getValor());
			}
		});
;		
		itens.getChildren().add(new TreeItem<Employee>(new Employee("teste", 10)));
		//itens.getChildren()
		
		itens.setExpanded(true);
		
		tb.setRoot(itens);
		
		cena = new Scene(layout);
		
		stage = primaryStage;
		
		stage.setScene(cena);
		
		stage.show();
		
	}
	
	public class Employee{
		
		private SimpleStringProperty nome;
		private SimpleStringProperty valor;
		
		public Employee(String nome, float valor) {
			this.nome = new SimpleStringProperty(nome);
			this.valor = new SimpleStringProperty(Float.toString(valor));
		}
		
		public String getNome() {
			return nome.get();
		}
		public void setNome(SimpleStringProperty nome) {
			this.nome = nome;
		}
		public String getValor() {
			return valor.get();
		}
		public void setValor(SimpleStringProperty valor) {
			this.valor = valor;
		}
		
	}

}
