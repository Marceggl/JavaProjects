package aulas;
import javax.swing.JOptionPane;

public class UltimoDigito {
	public static void main(String[] args) {
		int num, ultDig;
		
		//Pega o que o user digitou e dps transforma em inteiro
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero", "Ultimo D�gito", JOptionPane.INFORMATION_MESSAGE));
		
		ultDig = num % 10;
		
		JOptionPane.showMessageDialog(null,"O ultimo Digito � " + ultDig, "Ultimo Digito", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
