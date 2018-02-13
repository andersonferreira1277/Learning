package javaFXGui.javaFX03;

import java.util.ArrayList;
import java.util.List;

public class Vitrine {

	private static List<Produto> produtos = new ArrayList<Produto>();
	
	public void addProduto(Produto... ps ) {
		for (Produto p : ps) {
			produtos.add(p);
		}
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
}
