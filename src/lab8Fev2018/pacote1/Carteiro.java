package lab8Fev2018.pacote1;

public class Carteiro {
	private Carta carta;
	
	public void mostrar() {
		System.out.println(this.carta.nome);
		System.out.println(this.carta.data);
		System.out.println(this.carta.anexo);
	}

	public Carteiro(Carta carta) {
		super();
		this.carta = carta;
	}
}
