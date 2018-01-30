/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXGui.javaFXChartBar;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class ChartBarTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        

        //layout
        FlowPane root = new FlowPane();
        //cena
        Scene scene = new Scene(root, 600, 600);

        //no
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChartGrafico = new BarChart<>(xAxis, yAxis);
        
        //criar series
        XYChart.Series<String, Number> anderson = new XYChart.Series();
        anderson.setName("Anderson");
        XYChart.Series<String, Number> juliana = new XYChart.Series();
        juliana.setName("Juliana");
        XYChart.Series<String, Number> drow = new XYChart.Series();
        drow.setName("Drow");
        
        //adicionando dados a serie
        anderson.getData().add(new XYChart.Data<String, Number> ("Janeiro", 2000));
        juliana.getData().add(new XYChart.Data<String, Number> ("Janeiro", 2500));
        drow.getData().add(new XYChart.Data<String, Number> ("Janeiro", 1900));
        
        anderson.getData().add(new XYChart.Data<String, Number> ("Fevereiro", 2400));
        juliana.getData().add(new XYChart.Data<String, Number> ("Fevereiro", 2700));
        drow.getData().add(new XYChart.Data<String, Number> ("Fevereiro", 1990));
        
        anderson.getData().add(new XYChart.Data<String, Number> ("Março", 2900));
        juliana.getData().add(new XYChart.Data<String, Number> ("Março", 2800));
        drow.getData().add(new XYChart.Data<String, Number> ("Março", 2490));
        
        barChartGrafico.getData().addAll(anderson, juliana, drow);
        
        //adiciona o grafico ao grafo de cena
        
        root.getChildren().add(barChartGrafico);
        //adiocionar o no
        

        //adicionar ao palco
        primaryStage.setScene(scene);

        //exibir o palco
        primaryStage.setTitle("Hello World");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
