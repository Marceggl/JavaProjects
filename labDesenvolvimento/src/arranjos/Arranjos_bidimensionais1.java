package arranjos;

import java.util.Scanner;

public class Arranjos_bidimensionais1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declaração váriaveis;
		float M[][] = new float[12][12];
		float soma = 0;
		int C;
		char T;

		System.out.print("Digite a coluna desejada: ");
		C = input.nextInt();

		System.out.print("Digite 'M' para média e 'S' para soma: ");
		T = input.next().charAt(0);

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				M[i][j] = i + j;
			}
		}

		for (int i = 0; i < 12; i++) {
			soma = soma + M[i][C];
			System.out.printf("%.2f\n", M[i][C]);
		}

		if (Character.compare('M', T) == 0) {
			System.out.printf("Média: %.2f\n", (soma / 12));
		} else {
			System.out.printf("Soma: %.2f\n", soma);
		}
	}
}