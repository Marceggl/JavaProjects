package aulas;
import javax.swing.JOptionPane;


public class Modulos {
	//metodo que não retorna nada para o metodo principal
	public static void soma(int n1, int n2) {
		int total;
		
		total = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "A soma entre " + n1 + " + " + n2 + " = " + total, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
	}
	//metodo que retorna um número inteiro
	public static int mult(int n1, int n2) {
		return n1*n2; 
	}
		
	//modulo principal
	public static void main (String[] args) {
		int a, b, mult;
		String op;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primero número: ", "Calculadora", JOptionPane.INFORMATION_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: ", "Calculadora", JOptionPane.INFORMATION_MESSAGE));
		op = JOptionPane.showInputDialog(null, " Qual tipo de operação deseja ? \n soma - Para soma\n mult - Para multiplicação", "calculadora", JOptionPane.INFORMATION_MESSAGE);
		
		if(op.equals("soma")) {
			soma(a,b);
		}else if(op.equals("mult")) {
			mult = mult(a,b);
			JOptionPane.showMessageDialog(null, "A multiplicação destes número é "+ mult, "Calculadora", JOptionPane.WARNING_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Você digitou um operador válido", "Calculadora", JOptionPane.ERROR_MESSAGE );
		}
		
		
		
	}
	
}
