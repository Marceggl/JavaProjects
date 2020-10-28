package aulas;
import javax.swing.JOptionPane;

public class AreaTriangulo {
	static float area(float b, float h) {
		return b*h/2;
	}
	public static void main(String[] args) {
		float b, h, area;
		
		b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do triângulo", "Área Triângulo", JOptionPane.INFORMATION_MESSAGE));
		h = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do triângulo", "Área Triângulo", JOptionPane.INFORMATION_MESSAGE));
		
		area = area(b, h);
		JOptionPane.showMessageDialog(null, "A área do seu triângulo é: " +area, "Área triângulo", JOptionPane.WARNING_MESSAGE);
	}
}
