package estudo;
import java.util.Scanner;


public class Al_2_1 {
	public static void main(String[] args){
		//instanciar e criar um objeto Scanner
		Scanner input = new Scanner(System.in);
		
		//v�riaveis
		float num1, num2;
		
		//entrada de dados
		System.out.printf ("Soma de dois n�meros \n");
		System.out.printf("Digite o primeiro n�mero: ");
		num1 = input.nextFloat();
		
		System.out.printf("Digite o segundo n�mero: ");
		num2 = input.nextFloat();
		
		//processamento e saida
		System.out.printf("A soma %.2f + %.2f = %.2f", num1, num2, num1 + num2);
			
	}
}

