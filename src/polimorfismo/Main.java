package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operacao op;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite A para realizar adição");
		System.out.println("Digite S para realizar subtração");
		System.out.println("Digite M para realizar multiplicação");
		System.out.println("Digite D para realizar divisão");
		System.out.println("Digite (0) para SAIR");
		
		String key = teclado.next().toLowerCase();
		
		//Inicio do switch
		switch (key) {
		case "a":
			op = new Adicao();
			break;
		case "s":
			op = new Subtracao();
			break;
		case "m":
			op = new Multiplicacao();
			break;
		case "d":
			op = new Divisao();
			break;
		case "0":
			System.exit(0);

		default:
			op = new Operacao();
			break;
		}//end do switch
		
		String flag = "";
		ArrayList<Float> listaDeValores = new ArrayList<Float>();
		while(!flag.equals("0")) {
			flag = teclado.next();
			if (!!flag.equals("0")) {
				listaDeValores.add(Float.parseFloat(flag));
			}
		}
		
		teclado.close();
		
		if (listaDeValores.size() == 2) {
			op.calcular(listaDeValores.get(0), listaDeValores.get(1));
		} else if (listaDeValores.size() == 3) {
			op.calcular(listaDeValores.get(0), listaDeValores.get(1), listaDeValores.get(2));
		} else if (listaDeValores.size() > 3) {
			op.calcular(listaDeValores);
		}

	}

}
