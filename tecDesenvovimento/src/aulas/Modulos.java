package aulas;
import javax.swing.JOptionPane;


public class Modulos {
	//metodo que n�o retorna nada para o metodo principal
	public static void soma(int n1, int n2) {
		int total;
		
		total = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "A soma entre " + n1 + " + " + n2 + " = " + total, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
	}
	//metodo que retorna um n�mero inteiro
	public static int mult(int n1, int n2) {
		return n1*n2; 
	}
		
	//modulo principal
	public static void main (String[] args) {
		int a, b, mult;
		String op;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primero n�mero: ", "Calculadora", JOptionPane.INFORMATION_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo n�mero: ", "Calculadora", JOptionPane.INFORMATION_MESSAGE));
		op = JOptionPane.showInputDialog(null, " Qual tipo de opera��o deseja ? \n soma - Para soma\n mult - Para multiplica��o", "calculadora", JOptionPane.INFORMATION_MESSAGE);
		
		if(op.equals("soma")) {
			soma(a,b);
		}else if(op.equals("mult")) {
			mult = mult(a,b);
			JOptionPane.showMessageDialog(null, "A multiplica��o destes n�mero � "+ mult, "Calculadora", JOptionPane.WARNING_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Voc� digitou um operador v�lido", "Calculadora", JOptionPane.ERROR_MESSAGE );
		}
		
		
		
	}
	
}
