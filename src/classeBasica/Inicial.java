package classeBasica;

import javax.swing.JOptionPane;

public class Inicial {

	public static void main(String[] args) {
		String operacaEscolhida = JOptionPane.showInputDialog("Digite + para somar\n"
    			+ "- para subtratir\n"
    			+ "/ para dividir\n"
    			+ "* para multiplicar\n"
    			+ "^ para elevar");
    	
    	String stringNumero1 = JOptionPane.showInputDialog("Digite o 1 número para somar");
    	Float numero1 = Float.parseFloat(stringNumero1);
    	
    	String stringNumero2 = JOptionPane.showInputDialog("Digite o 2 número para somar");
    	Float numero2 = Float.parseFloat(stringNumero2);
    	
    	Operacao op = new Operacao();
    	op.setNumero1(numero1);
    	op.setNumero2(numero2);
    	
    	if (operacaEscolhida.equals("+")) {
    		mostrarReslutado(numero1, numero2, op.somar());
    	}
    	else if (operacaEscolhida.equals("-")) {
    		mostrarReslutado(numero1, numero2, op.subtrair());
    	}
    	else if (operacaEscolhida.equals("/")) {
    		try {
				mostrarReslutado(numero1, numero2, op.dividir());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	else if (operacaEscolhida.equals("*")) {
    		mostrarReslutado(numero1, numero2, op.multiplicar());
    	}
    	else if (operacaEscolhida.equals("^")) {
    		mostrarReslutado(numero1, numero2, op.elevar());
    	}

	}
	
	public static void mostrarReslutado(float numero1, float numero2, float resultado) {
		JOptionPane.showMessageDialog(null, "Numero1: " + numero1 + "\n" 
				+ "Numero2: " + numero2 + "\n"
				+ "Resultado: " + resultado);
	}

}
