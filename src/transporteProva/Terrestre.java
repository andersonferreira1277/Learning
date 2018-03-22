package transporteProva;

public class Terrestre extends Veiculo{
	
	
	private int limiteVelocidade;
	
	Terrestre() {
		super();
		limiteVelocidade = 110;
	}
	
	public void acelerar(int km) {
		if (estadoLigado() && (velocidade + km) <= limiteVelocidade ) {
			velocidade =+ km;
		} else if (estadoLigado() && (velocidade + km) > limiteVelocidade ) {
			velocidade = limiteVelocidade;
		}
	}
	
	public int getLimiteVelocidade() {
		return limiteVelocidade;
	}
}
