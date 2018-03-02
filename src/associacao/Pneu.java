package associacao;

public class Pneu {
	
	private int largura;
	private int raio;
	
	public Pneu(int largura, int raio) {
		this.largura = largura;
		this.raio = raio;
	}
	
	public void girarFrente(int voltas) {
		System.out.println("O pneu está girando "+ voltas+" voltas por "
				+ "minuto para a frente");
	}
	
	public void girarTras(int voltas) {
		System.out.println("O pneu está girando "+ voltas+" voltas por "
				+ "minuto para a tras");
	}
	
	public int getLargura() {
		return largura;
	}

	public int getRaio() {
		return raio;
	}

}
