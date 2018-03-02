package associacao;

public class Carro {
	
	private String cor;
	private String modelo;
	private Motor motor;
	private Cambio cambio;
	private Pneu[] pneus;
	
	public Carro(String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
		this.motor = new Motor(75);
		pneus = new Pneu[4];
		for (int i = 0; i > 4 ; i++) {
			this.pneus[i] = new Pneu(185, 14);
		};
	}
	
	public void ligar() {
		motor.ligar();
	}
	
	public void desligar() { 
		while (motor.getAceleracao() > 0) {
			motor.desacelerar();
		}
		motor.desligar();
	}
	
	public void acelerar() {
		motor.acelerar();
		int rotacao = (motor.getPotencia() * motor.getAceleracao() * cambio.getMarcha());
		
		if (cambio.getMarcha() == -1) {
			for (Pneu pneu : pneus) {
				pneu.girarTras(rotacao);
			}
		} else if (cambio.getMarcha() > 0) {
			for (Pneu pneu : pneus) {
				pneu.girarFrente(rotacao);
			}
		}
	}
	
	public void desacelerar() {
		motor.desacelerar();
		int rotacao = (motor.getPotencia() * motor.getAceleracao() * cambio.getMarcha());
		
		if (cambio.getMarcha() == -1) {
			for (Pneu pneu : pneus) {
				pneu.girarTras(rotacao);
			}
		} else if (cambio.getMarcha() > 0) {
			for (Pneu pneu : pneus) {
				pneu.girarFrente(rotacao);
			}
		}
	}
	
	public void aumentarMarcha() {
		cambio.aumentarMarcha();
	}
	
	public void reduzirMarcha() {
		cambio.reduzirMarcha();
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public String getModelo() {
		return this.modelo;
	}
}
