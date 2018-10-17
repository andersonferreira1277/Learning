package associacao;

public class Motor {
	
	private int potencia;
	private boolean estadoLigado;
	private int aceleracao;
	
	public Motor(int potencia) {
		this.potencia = potencia;
	}
	
	public void ligar() {
		if (estadoLigado) {
			System.out.println("Motor já estava ligado");
		} else {
			estadoLigado = true;
			System.out.println("Motor ligado com sucesso!");
		}
		
	}
	
	public void desligar() {
		if (estadoLigado) {
			estadoLigado = false;
			System.out.println("Motor desligado com sucesso!");
		} else {
			System.out.println("Motor já estava desligado");
		}
	}
	
	public void acelerar() {
		if (estadoLigado) {
			if (aceleracao < 10000) {
				aceleracao += 1000;
			}
			System.out.println("Motor acelerando a "+ aceleracao + "rotacões por minuto.");
		} else {
			System.out.println("O motor não está ligado");
		}
	}
	
	public void desacelerar() {
		if (estadoLigado) {
			if (aceleracao >= 1000) {
				aceleracao -= 1000;
			}
			System.out.println("Motor acelerando a "+ aceleracao + "rotacões por minuto.");
		} else {
			System.out.println("O motor não está ligado");
		}
	}

	public int getPotencia() {
		return potencia;
	}

	public boolean isEstadoLigado() {
		return estadoLigado;
	}

	public int getAceleracao() {
		return aceleracao;
	}
	
}
