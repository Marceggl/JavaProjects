package lacosDeRepeticao;
import java.util.Scanner;

public class LacoDeRepeticao_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, x;
		float s=0;
		
		System.out.print("Digite um número");
		n = input.nextInt();
		
		for(x=1; x<=n; x++) {
			s += (1/(float)x);
		}	
		System.out.printf("%.2f\n", s);
	}
}
