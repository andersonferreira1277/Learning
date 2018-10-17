package transporteProva;

public class Main {

	public static void main(String[] args) {
		Veiculo v = new Helicoptero();
		v.ligar();
		v.acelerar(100);
		// v.alterarEstabilidade();
		v = new Terrestre();
		v.ligar();
		v.acelerar(80);
		Aereo a = new Aviao();
		a.ligar();
		a.subir(50);
		/*Terrestre t = new Veiculo();
		t.ligar();
		t.acelerar(50);*/

	}

}
