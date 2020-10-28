package aulas;
//
import javax.swing.JOptionPane;

public class TestePane {
	public static void main(String[] args) {
		float n1, n2, media, frequencia;
		
		//Mostra ao usuario uma caixa de texto que pega o que for digitado e transforma em números float
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a primeira nota", "Notas", JOptionPane.INFORMATION_MESSAGE));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a segunda nota", "Notas", JOptionPane.INFORMATION_MESSAGE));
		frequencia = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a frequencia", JOptionPane.INFORMATION_MESSAGE));
		
		media = (n1+n2)/2;
		
		if (frequencia < 75) {
			//faz o JOptionPane mostrar a msg na tela
			JOptionPane.showMessageDialog(null, "Reprovado", "Reprovado", JOptionPane.INFORMATION_MESSAGE );
		}else if(media < 6){
			JOptionPane.showMessageDialog(null, "Reprovado", "Reprovado", JOptionPane.INFORMATION_MESSAGE );
		}else {
			JOptionPane.showMessageDialog(null, "Aprovado", "Aprovado", JOptionPane.INFORMATION_MESSAGE );
		}
		
	}

	
}
