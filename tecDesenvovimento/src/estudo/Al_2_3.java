package estudo;
import java.util.Scanner;

public class Al_2_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declaracao variaveis
		float b, h, peri, area_retangulo;
		
		//entrada de dados
		System.out.print("Algoritmo para calcular perimetro e �rea de um ret�ngulo.\n");
		System.out.print("Digite a base do ret�ngulo: ");
		b = input.nextFloat();
		
		System.out.print("Digite a altura do ret�ngulo: ");
		h = input.nextFloat();
		
		//processamento
		peri = (b*2)+(h*2);
		area_retangulo = b*h;
		
		//saida dos dados
		System.out.printf("O retangulo tem: \n Base - %.2f \n altura - %.2f \n", b, h);
		System.out.printf("O perimetro deste � - %.2f \n A �rea deste � - %.2f", peri, area_retangulo);
		
		
	}
}
