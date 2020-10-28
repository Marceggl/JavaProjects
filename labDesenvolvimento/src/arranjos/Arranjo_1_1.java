package arranjos;
import java.util.Scanner;

public class Arranjo_1_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A[] = new int[5];
		char B[] = new char[5];
		int C[] = new int[5];
		int D[] = new int[20];
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite um valor " + (i+1)+ " de A: ");
			A[i] = input.nextInt();
			
			System.out.println("Digite a operação " + (i+1) + " de B: ");
			B[i] = input.next().charAt(0);
			
			System.out.println("Digite um valor " + (i+1)+ " de C: ");
			C[i] = input.nextInt();
		}
		
		for(i = 0; i < 5;  i ++) {
			if(Character.compare(B[i], '+') == 0) {
				D[i] = A[i]+C[i];
			}else if(Character.compare(B[i], '-') == 0) {
				D[i] = A[i] - C[i];
			}else if(Character.compare(B[i], '*') == 0) {
				D[i] = A[i] * C[i];
			}else {
				D[i] = A[i] / C[i];
			}
		}
		for(i=0; i<5; i++) {
			System.out.println(A[i] + " " + B[i] + " " + C[i] + " = " + D[i]);
		}
		
	}
}
