package aulas;
import javax.swing.JOptionPane;

public class SomaReais {
	static float soma(float a, float b) {
		return a + b;
	}
		
	public static void main(String[] args){
		float n1, n2, soma;
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número:", "Soma de dois números reais", JOptionPane.INFORMATION_MESSAGE));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite outro número:", "Soma de dois números reais", JOptionPane.INFORMATION_MESSAGE));
		
		soma = soma(n1, n2);
		
		JOptionPane.showMessageDialog(null, "A soma de " + n1 + " + " +n2+ " = " +soma);
		
	}
}