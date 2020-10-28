package testes;
import java.util.Scanner;
public class Exercicio_1_aula_6_veri {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		float s=0;
			
		while(n < 1) {
			System.out.print("Digite um número inteiro: ");
			n = input.nextInt();
		}
			for(float i = 1; i <= n; i++) {
				s += 1/i;
				System.out.print(s+"\n");
			}
	}
}
