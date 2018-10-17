package polimorfismo;

import java.util.List;

public class Subtracao extends Operacao {
	
	@Override
	public void calcular(float num1, float num2) {
		super.calcular(num1, num2);
		System.out.println("Subtração " + (num1-num2));
	}
	
	@Override
	public void calcular(float num1, float num2, float num3) {
		super.calcular(num1, num2, num3);
		System.out.println("Subtração " + ((num1-num2)-num3));
	}	
	
	@Override
	public void calcular(List<Float> numeros) {
		Float resultado = 0f;
		super.calcular(numeros);
		
		for (Float i : numeros) {
			resultado -= i;
		}
		
		System.out.println("Subtração " + (resultado));
	}
}
