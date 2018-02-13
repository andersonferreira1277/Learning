package lab8Fev2018.pacote1;

public class Documento {
	
	protected String nome;
	public String data;
	
	public void mostrar() {
		System.out.println(this.nome + "\n" +this.data);
	}

	public Documento(String nome, String data) {
		this.nome = nome;
		this.data = data;
	}
	
}
