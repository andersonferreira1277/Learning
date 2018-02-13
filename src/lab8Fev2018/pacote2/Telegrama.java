package lab8Fev2018.pacote2;

import lab8Fev2018.pacote1.Carta;
import lab8Fev2018.pacote1.Documento;

public class Telegrama extends Documento{
	
	private String assinatura;
	
	public void mostrar() {
		System.out.println(this.nome + "\n" + this.data + "\n" + this.assinatura);
	}
	
	public void mostrar2() {
		Carta c = new Carta("Anderson", "Anderson Ferreira Câmara", "Foto");
		Telegrama t = new Telegrama("Anderson", "08/02", "assinatura");
		
		System.out.println(c.data);
		System.out.println(t.data);
	}

	public Telegrama(String nome, String data, String assinatura) {
		super(nome, data);
		this.assinatura = assinatura;
	}
}
