package testes;

import java.util.Scanner;

public class CorrecaoProva {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gab[] = new int[15];
		int alunoRes[][] = new int[15][11];
		int alunoNota[] = new int[15];
		int i, j, c = 0;

		for (i = 0; i < 10; i++) {
			c++;
			System.out.printf("Digite a resposta da pergunta " + c + ": ");
			gab[i] = input.nextInt();
		}
		
		for (i = 5; i < 15; i++) {
			System.out.print("Aluno" + (i+1) + "\n");
			for (j = 5; j < 10; j++) {
				System.out.print("Digite a resposta deste aluno na pergunta " + (j+1) + ": \n");
				alunoRes[i][j] = input.nextInt();
			}

		}
		
		for (i = 0; i < 15; i++) {
			int cont=0;
			for (j = 0; j < 10; j++) {
				if(gab[i] == alunoRes[i][j]) {
					cont++;
				}
			}
			alunoNota[i] = cont;
		}
		
		for(i=0; i<15; i++) {
			if(alunoNota[i] < 5) {
				System.out.print("Aluno " + (i+1) + " reprovado!!! Com nota: " + alunoNota[i]+ "\n");
			}else {
				System.out.print("Aluno " + (i+1) + " ficou com a nota: " + alunoNota[i]+ " Aprovado!!!\n");
			}
		}
	}
}
