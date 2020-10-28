package avaliacao;
import java.util.Scanner;

public class Exercicio1SegundoGrau {
	//Calcular os X
	public static float calcX1(float d, float a, float b, float c) {
		float x;
		x = (float) ((-b+Math.sqrt(d))/(2*a));
		return x;
	}
	public static float calcX2(float d, float a, float b, float c) {
		float x;
		x = (float) ((-b-Math.sqrt(d))/(2*a));
		return x;
	}
	//Calcular Delta
	public static float calcD(float a, float b, float c) {
		return (b*b)-(4*a*c);			
	}
	//Verificar A
	public static String veriA (float a) {
		String txt = null;		
		if(a == 0) {
			txt = "o termo 'a' tem que ser diferente de 0";
			return txt;
		}
		return txt;
	}
	//Função principal
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a,b,c,x1, x2;
		float delta;
		String aOK;
				
		//Pegando os termos da equação;
		System.out.print("Digite o valor de A: ");
		a = input.nextFloat();
		System.out.print("Digite o valor de B: ");
		b = input.nextFloat();
		System.out.print("Digite o valor de C: ");
		c = input.nextFloat();
		
		//Função pra verificar se a é diferente de 0;
		aOK = veriA(a);
		if(aOK != null) {
			System.out.print(aOK);
		}else {
			//Calcular o valor de Delta;
			delta = calcD(a, b, c);
			//Calcular x
			x1 = calcX1(delta, a, b, c);
			x2 = calcX2(delta, a, b, c);
			//Mostrar os valores de x1 e x2				
			System.out.printf("O valor de  X1 é %.2f \n", x1);
			System.out.printf("O valor de  X2 é %.2f \n", x2);
		}
		
		
	}
	
	
}
