package aulas;

public class AulaModulos_1 {
	//Criando um módulo procedimento (void) com nome troca
	public static void troca (int x, int y) {
		int aux;
		aux = x;
		x = y;
		y = aux;
	}
	
	public static void main (String[] args) {
		int a,b;
		a = 7;
		b = 15;
		troca(a,b);
		System.out.printf("%d %d\n", a, b);
	}
	
}
