package aulas;
import javax.swing.JOptionPane;

public class AreaTriangulo {
	static float area(float b, float h) {
		return b*h/2;
	}
	public static void main(String[] args) {
		float b, h, area;
		
		b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do tri�ngulo", "�rea Tri�ngulo", JOptionPane.INFORMATION_MESSAGE));
		h = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do tri�ngulo", "�rea Tri�ngulo", JOptionPane.INFORMATION_MESSAGE));
		
		area = area(b, h);
		JOptionPane.showMessageDialog(null, "A �rea do seu tri�ngulo �: " +area, "�rea tri�ngulo", JOptionPane.WARNING_MESSAGE);
	}
}
