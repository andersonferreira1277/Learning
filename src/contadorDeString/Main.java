package contadorDeString;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra = teclado.nextLine();
		
		char[] palavraEmChar = palavra.toCharArray();
		int k = 1;
		for (char i : palavraEmChar) {
			System.out.println(k);
			k++;
		}

	}

}
