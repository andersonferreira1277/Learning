package transporteProva;


public class Aereo extends Veiculo {
	
	protected int altitude;
	
	Aereo() {
		super();
		altitude = 0;
	}
	
	public void subir(int metros) {
		altitude = (estadoLigado()) ? altitude+metros: altitude;
	}
	
	public void descer(int metros) {
		altitude = (estadoLigado()) ? altitude-metros: altitude;
	}
	
	public void acelerar(int km) {
		if (estadoLigado()) {
			int flag = velocidade+km;
			if (altitude <= 100 && flag <=200) {
				velocidade += km;
			} else if (altitude > 100 && flag <=800) {
				velocidade += km;
			}
		}
	}
	
	public int getAltitude() {
		return altitude;
	}
}
