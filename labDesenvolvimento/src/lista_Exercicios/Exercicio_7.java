package lista_Exercicios;
import java.util.Scanner;
public class Exercicio_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float tempMeses[] = new float[12];
		String meses[] = {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		float	media,soma=0;
		int i;
		for(i=0;i<12;i++) {
			System.out.print("Digite a m�dia de temperatura do m�s ("+(i+1)+"/12): ");
			tempMeses[i] = input.nextFloat();
			soma += tempMeses[i];
		}
		//media anual
		media = soma/12;
		System.out.printf("A media anual de temperatura �: %.2f�C\n", media);
		//Meses que passaram da m�dia
		for(i=0;i<12;i++) {
			if(tempMeses[i] >= media) {
				System.out.print("O m�s " +(i+1) + " " + meses[i] + " Passou d� m�dia com temperatura: " + tempMeses[i]+"�C\n" );
			}
		}
	}
}
