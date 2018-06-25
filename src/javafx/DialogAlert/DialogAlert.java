package javafx.DialogAlert;

import java.util.Optional;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;

public class DialogAlert {

	public void metodo() {
		Dialog<Pair<Integer, String>> dialog = new Dialog<>();
		dialog.setTitle("Adicionar uma conta");

		dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

		GridPane grPane = new GridPane();

		TextField nomeConta = new TextField();
		TextField valor = new TextField();

		//Validando float
		valor.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

				if (!newValue.equals("")) {
					newValue = newValue.replaceAll(",", ".");
					try {
						Float.parseFloat(newValue);
					} catch (NumberFormatException e) {
						valor.setText(oldValue);
					}
					if (newValue.contains("f") || newValue.contains("d") || newValue.contains("F") || newValue.contains("D")) {
						valor.setText(oldValue);
					}
				}
			}
		});

		grPane.add(new Label("Descrição da conta:"), 0, 0);
		grPane.add(nomeConta, 1, 0);
		grPane.add(new Label("Saldo:"), 0, 1);
		grPane.add(valor, 1, 1);

		dialog.getDialogPane().setContent(grPane);

		dialog.setResultConverter(dialogButton -> {
			if (dialogButton == ButtonType.OK) {
				return new Pair<>(1, valor.getText());
			}
			return null;
		});

		Optional<Pair<Integer, String>> result = dialog.showAndWait();

		result.ifPresent(e -> {
			//faça algo
		});

	}
}
