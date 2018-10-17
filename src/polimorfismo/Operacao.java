package polimorfismo;

import java.util.List;

public class Operacao {
	public void calcular(float num1, float num2) {
		System.out.println("Calculando dois valores");
	}
	
	public void calcular(float num1, float num2, float num3) {
			System.out.println("Calculando três valores");
	}	

	public void calcular(List<Float> numeros) {
		System.out.println("Calculando lista");
	}
}
