package aulas;

public class AulaModulo_3 {
	public static void eq2(int A, int B, int C, char c) {
		int X = 0;
		
		if(A + 2 > B - 3) {
			X = C * 2;
		}
		if(C/4 < B * 3) {
			X = X + 5;
		}
		if(X < A + B) {
			C = A - B;
		}else {
			B = C * A;
		}
		X = A + B - C;
		System.out.printf("%c) %d\n", c, X);
	}
	
	public static void main(String[] args) {
		int A,B,C;
		eq2(3, 4, 5, 'a');
		eq2(8 - 3 * 2, - 5 + 12 / 2, -1, 'b');
		
		A = 3*2;
		B = A-3;
		C = A+B;
		
		eq2(B, C, A, 'c');
		
	
	}
}
