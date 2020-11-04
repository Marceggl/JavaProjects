//7 - Faça um programa que receba a temperatura média de cada mês do ano e armazene-as
//em uma lista. Após isto, calcule a média anual das temperaturas e mostre todas as
//temperaturas acima da média anual, e em que mês elas ocorreram (mostrar o mês por
//extenso: 1 - Janeiro, 2 - Fevereiro, ...
package lista_Exercicios;
import java.util.Scanner;
public class Exercicio_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float tempMeses[] = new float[12];
		String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		float	media,soma=0;
		int i;
		for(i=0;i<12;i++) {
			System.out.print("Digite a média de temperatura do mês ("+(i+1)+"/12): ");
			tempMeses[i] = input.nextFloat();
			soma += tempMeses[i];
		}
		//media anual
		media = soma/12;
		System.out.printf("A media anual de temperatura é: %.2fºC\n", media);
		//Meses que passaram da média
		for(i=0;i<12;i++) {
			if(tempMeses[i] >= media) {
				System.out.print("O mês " +(i+1) + " " + meses[i] + " Passou dá média com temperatura: " + tempMeses[i]+"ºC\n" );
			}
		}
	}
}
