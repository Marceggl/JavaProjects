package avaliacao;
import java.util.Scanner;

public class Exercicio2ConversaoMetros {
	public static float mili(float x) {
		float mm;
		mm = x*1000;
		
		return mm;
	}
	public static float cent(float x) {
		float cm;
		cm = x*100;
		
		return cm;
	}
	public static float deci(float x) {
		float dm;
		dm = x*10;
		
		return dm;
	}
	public static float deca(float x) {
		float dam;
		dam = x/10;
		
		return dam;
	}
	public static float hect(float x) {
		float hm;
		hm = x/100;
		
		return hm;
	}
	public static float km(float x) {
		float km;
		km = x/1000;
		
		return km;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float m=0, res;
		int ent;
				
		while(m<=0) {
		System.out.print("Digite um valor em metros: ");
		m = input.nextFloat();
		}
		System.out.print("1 - Milimetros;\n2 - Centimetros;\n3 - Decímetros;\n4 - Decâmetro;\n5 - Hectometro;\n6 - Quilometro.\nDigite:");
		ent = input.nextInt();
		
		switch(ent) {
		case 1:
			res = mili(m);
			System.out.printf("O valor em milimetros(mm) de %.2f é %.2f", m, res);
			break;
		case 2:
			res = cent(m);
			System.out.printf("O valor em centimetros(cm) de %.2f é %.2f", m, res);
			break;
		case 3:
			res = deci(m);
			System.out.printf("O valor em decimetros(dm) de %.2f é %.2f", m, res);
			break;
		case 4:
			res = deca(m);
			System.out.printf("O valor em decâmetros(dam) de %.2f é %.2f", m, res);
			break;
		case 5:
			res = hect(m);
			System.out.printf("O valor em hectômetros(hm) de %.2f é %.2f", m, res);
			break;
		case 6:
			res = km(m);
			System.out.printf("O valor em Quilometros(km) de %.2f é %.2f", m, res);
			break;
			default:
				System.out.print("Entrada inválida");
		}
		
	}
}
