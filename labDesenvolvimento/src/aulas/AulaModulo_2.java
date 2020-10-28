package aulas;

public class AulaModulo_2 {
	public static void eq1 (int A, char c) {
		int x;
		x = (int)Math.pow(A, 2) + (5*A)+3;
		System.out.printf("%c) %d\n", c, x);
	}
	public static void main(String[] args) {
		int b, a;
		eq1(2, 'a');
		eq1((3*4) - 14 + (8/4), 'b');
		b = 3;
		eq1(b * 2 - 1, 'c');
		b = 6;
		a = b * 5 / 3;
		eq1(a - 9, 'd');
		
	}
}
