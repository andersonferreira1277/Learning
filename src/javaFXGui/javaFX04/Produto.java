package javaFXGui.javaFX04;

public class Produto {

	private String produto;
	private double preco;
	
	//Construtores
	public Produto(String produto, double preco) {
		this.produto = produto;
		this.preco = preco;
	}
	
	//Getters and Setters
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}//Getters and Setters END
	
	
}
