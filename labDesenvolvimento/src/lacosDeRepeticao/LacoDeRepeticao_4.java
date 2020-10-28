package lacosDeRepeticao;
import java.util.Scanner;

public class LacoDeRepeticao_4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n, contAprov = 0;
		float nota, contN = 0;
		
		for (n=1; n<=5; n++) {
			do {
				System.out.print("Digite nota: ");
				nota = input.nextFloat();
			}while(nota < 0 || nota > 10);
			if(nota >= 6) {
				contAprov ++;
			}
			contN += nota;
		}
		System.out.printf("Aprovados %d\n", contAprov);
		System.out.printf("Média da sala %.2f", contN/5);
	}
}
