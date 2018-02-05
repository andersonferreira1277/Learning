package javaFXGui.javaFX03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ItemApp extends Application {
	
	private AnchorPane pane;
	private Scene cena;
	private ImageView imgItem;
	private Label lbPreco, lbDescricao;
	private Button btAddCarrinho;
	private static Stage stage;
	private static Produto produto;
	private static int index;
	private static String[] images = {"http://topper.vteximg.com.br/arquivos/ids/163326-400-400/4200151-624.jpg?",
			"http://dev.goleirodealuguel.com.br/wp-content/uploads/2015/09/luva_umbro_neo_pro_cp_preta_grafite_la"
			+ "ranja_17581_1_20150807173331.jpg",
			"http://www.netshirtsoficial.com.br/image/cache/data/frances/Camisas-do-PSG-2017-2018-Nike-kit-6-1500x1800.jpg",
			"https://assets.nike.com.br/ArquivoExibir/1132302.jpg",
			"https://dafitistatic-a.akamaihd.net/p/Topper-Caneleira-Topper-Difusion-Training-Preta-2083-6286343-1-zoom.jpg"};

	@Override
	public void start(Stage primaryStage) throws Exception {
		initComponets();
		primaryStage.setScene(cena);
		primaryStage.setTitle("Hello JavaFX");
		primaryStage.show();
	}

	public void initComponets() {
		pane = new AnchorPane();
		pane.setPrefSize(600, 400);
		
		imgItem = new ImageView(new Image(images[index]));
		imgItem.setLayoutX(150);
		imgItem.setLayoutY(100);
		imgItem.fitHeightProperty().set(250);
		imgItem.fitWidthProperty().set(275);
		
		lbDescricao = new Label("Produto: "+produto.getProduto());
		lbDescricao.setFont(Font.font("Helvetica", FontWeight.BOLD, 16));
		lbDescricao.setTextFill(Color.web("#FF6347"));
		lbDescricao.setLayoutY(50);
		
		lbPreco = new Label("Preço: "+Double.toString(produto.getPreco()));
		lbPreco.setFont(Font.font("Helvetica", FontWeight.BOLD, 16));
		lbPreco.setTextFill(Color.web("#FF6347"));
		lbPreco.setLayoutY(100);
		
		btAddCarrinho = new Button("Adicionar ao carrinho");
		
		pane.getChildren().addAll(imgItem, lbPreco, lbDescricao, btAddCarrinho);
		
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% " +
                "to 100% 100%, blue 0%, silver 100%);");
		
		cena = new Scene(pane);
	}
	
	public static Stage getStage() {
		return stage;
	}
	
	public static Produto getProduto() {
		return produto;
	}
	
	public static void setProduto(Produto p) {
		ItemApp.produto = p;
	}
	
	public static int getIndex() {
		return index;
	}
	
	public static void setIndex(int i) {
		ItemApp.index = i;
	}

}
