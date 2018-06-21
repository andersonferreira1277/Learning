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

public class TView extends Application{
	
	private Stage stage;
	private Scene cena;
	
	@FXML
    private VBox layout;
	
	@FXML
    private TreeTableView<Conta> tb;

    @FXML
    private TreeTableColumn<Conta, String> tcNome;

    @FXML
    private TreeTableColumn<Conta, Float> tcValor;
    
    TreeItem<Conta> itens = new TreeItem<Conta>(new Conta("Conta", 15));

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader fLoader = new FXMLLoader(getClass().getResource("tView.fxml"));
		fLoader.setController(this);
		fLoader.load();
		
		
		
		tcNome.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Conta,String>, ObservableValue<String>>() {
			
			@Override
			public ObservableValue<String> call(CellDataFeatures<Conta, String> param) {
				// TODO Auto-generated method stub
				return new SimpleStringProperty(param.getValue().getValue().getNome());
			}
		});
		tcValor.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Conta,Float>, ObservableValue<Float>>() {
			
			@Override
			public ObservableValue<Float> call(CellDataFeatures<Conta, Float> param) {
				// TODO Auto-generated method stub
				return new SimpleFloatProperty(param.getValue().getValue().getValor()).asObject();
			}
		});
		
		itens.getChildren().add(new TreeItem<Conta>(new Conta("teste", 10)));
		//itens.getChildren()
		
		itens.setExpanded(true);
		
		tb.setRoot(itens);
		
		cena = new Scene(layout);
		
		stage = primaryStage;
		
		stage.setScene(cena);
		
		stage.show();
		
	}

}
