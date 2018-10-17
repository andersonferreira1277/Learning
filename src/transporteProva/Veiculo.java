package transporteProva;

public class Veiculo {
	
	protected int velocidade;
	private boolean estadoLigado;
	
	Veiculo(){
		velocidade = 0;
		estadoLigado = false;
	}
	
	public void ligar() {
		estadoLigado = true;
	}
	
	public void desligar() {
		estadoLigado = false;
	}
	
	public void acelerar(int km) {
		if (estadoLigado){
			velocidade += km;
		}
	}
	
	public void desacelerar(int km) {
		if (estadoLigado && (velocidade-km) >= 0) {
			velocidade -= km;
		} else if (estadoLigado && (velocidade-km) < 0) {
			velocidade = 0;
		}
	}
	
	public boolean estadoLigado() {
		return estadoLigado;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
}
