package lab8Fev2018.pacote1;

public class Carta extends Documento{
	String anexo;
	
	@Override
	public void mostrar() {
		System.out.println(this.nome + "\n" + this.data + "\n" + this.anexo);
	}

	public Carta(String nome, String data, String anexo) {
		super(nome, data);
		this.anexo = anexo;
	}
}
