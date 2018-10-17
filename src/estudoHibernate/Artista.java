package estudoHibernate;

public class Artista {
	
	private int id;
	private String nome;
	private Boolean banda;
	private String pais;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getBanda() {
		return banda;
	}
	public void setBanda(Boolean banda) {
		this.banda = banda;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

}
