//5) Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor
//a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
package lista_Exercicios;
import java.util.Scanner;
public class Exercicio_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float mediaAlunos[][] = new float[10][5];
		int i, j, upMedia = 0;
		for(i=0; i<10;i++) {
			for(j=0;j<4;j++) {
				System.out.print("Digite a nota " + (j+1) + " do aluno " + (i+1)+ ": \n");
				mediaAlunos[i][j] = input.nextFloat();
				mediaAlunos[i][4] += mediaAlunos[i][j];
			}
			mediaAlunos[i][4] = mediaAlunos[i][4]/4;
			if(mediaAlunos[i][4] >= 7) {upMedia++;	}
		}
		System.out.print("O número de alunos acima da média é: " + upMedia);
}}