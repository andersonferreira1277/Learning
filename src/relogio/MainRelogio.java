package relogio;

import javafx.application.Application;

public class MainRelogio {
	
	public static void main(String[] args) {
		
		TelaRelogio telaRelogio = new TelaRelogio();
		Application.launch(telaRelogio.getClass(), args);
	}
}
