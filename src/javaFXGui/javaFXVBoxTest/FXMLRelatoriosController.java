/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXGui.javaFXVBoxTest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class FXMLRelatoriosController implements Initializable {
    
    @FXML
    private BarChart<String, Integer> barChartGrafico;
    @FXML
    private CategoryAxis xAxis;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series<String, Integer> series = new XYChart.Series();
        series.setName("2016");
        series.getData().add(new XYChart.Data<>("janeiro",20));
        series.getData().add(new XYChart.Data<>("fevereiro",25));
        series.getData().add(new XYChart.Data<>("março",100));
        barChartGrafico.getData().add(series);
    }    
    
}
