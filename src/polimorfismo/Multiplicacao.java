package polimorfismo;

import java.util.List;

public class Multiplicacao extends Operacao {

	@Override
	public void calcular(float num1, float num2) {
		super.calcular(num1, num2);
		System.out.println("Multiplicação "+ (num1*num2));
	}
	
	@Override
	public void calcular(float num1, float num2, float num3) {
			super.calcular(num1, num2, num3);
			System.out.println("Multiplicação "+ (num1*num2*num3));
	}	
	
	@Override
	public void calcular(List<Float> numeros) {
		super.calcular(numeros);
		Float resultado = 0f;
		
		for (Float i : numeros) {
			resultado *= i;
		}
		System.out.println("Multiplicação " + resultado);
	}
}
