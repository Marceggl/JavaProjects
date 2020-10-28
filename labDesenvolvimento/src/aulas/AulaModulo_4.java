package aulas;

public class AulaModulo_4 {
	//procedimento não tem retorno "VOID"
	public static void main (String[] args) {
		int a = 0, b = 10, c =-10;
		
		System.out.printf("%d\n", sinal(a));
		System.out.printf("%d\n", sinal(b));
		System.out.printf("%d\n", sinal(c));
		
	}
	//função tem retorno Tipo de retorno "int"
	public static int sinal (int x) {
		if(x > 0) {
			return 1;
		}else {
			if(x == 0) {
				return 0;
			}else {
				return -1;
			}	
		}
	}
}
