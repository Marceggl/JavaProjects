package aulas;

public class AulaModulo_5 {
	public static void main(String[] args) {
		raiz(1,2,1);
		
	}

	public static double delta (int a, int b, int c) {
		return (b*b)-(4*a*c);
	}
	public static void raiz(int a, int b, int c) {
		double x1, x2, d;
		d = delta(a,b,c);
		
		if(d>0 || d==0) {
			x1 = (-b + Math.sqrt(d)/(2*a));
			x2 = (-b - Math.sqrt(d)/(2*a));
			
			System.out.printf("X1 = %.2f\nX2 = %.2f\n", x1, x2);
		}else {
			System.out.print("Não existe raiz real\n");
		}
		
	}
}