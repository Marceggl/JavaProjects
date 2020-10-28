package arranjos;

import java.util.Scanner;

public class Arranjos_Bidimensionais3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N, i, j, a, b;
		System.out.print("Digite um número: ");
		N = input.nextInt();
		while (N > 0) {
			int M[][] = new int[N][N];
			for (i = 0; i < N; i++) {
				for (j = 0; j < N; j++) {
					M[i][j] = 0;
				}
			}
			a = 0;
			b = N;
			while (a < b) {
				for (i = a; i < b; i++) {
					for (j = a; j < b; j++) {
						M[i][j]++;
					}
				}
				a++;
				b--;
			}
			for (i = 0; i < N; i++) {
				for (j = 0; j < N; j++) {
					System.out.printf("%d ", M[i][j]);
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
			N = input.nextInt();
		}
	}
}