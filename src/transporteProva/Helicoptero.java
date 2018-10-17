package transporteProva;

public class Helicoptero extends Aereo{
	
	private boolean estaEstavel;
	
	Helicoptero(){
		super();
		estaEstavel = true;
	}
	
	public void alterarEstabilidade() {
		estaEstavel = !estaEstavel; //inverte o valor
	}
	
	public void acelerar(int km) {
		if (estadoLigado()) {
			if (estaEstavel && (velocidade+km) <= 200) {
				velocidade+=km;
			} else if ((velocidade+km) <= 100){ //caso estaEstavel false, n�o precisa mais verificar aqui, apenas verifica a velocidade
				velocidade += km;
			}
		}
	}
	
	public boolean estaEstavel() {
		return estaEstavel;
	}
}
