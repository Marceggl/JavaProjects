package lacosDeRepeticao;
import java.util.Scanner;

public class LacoDeRepeticao_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age, ageAcu = 0, contMulher = 0, cont = 0, contHomem = 0;
		float salario, salarioAcu = 0, mediaIdade;
		char sexo;
		
		System.out.print("Digite a idade: ");
		age = input.nextInt();
		
		while(age >= 0) {
			do {
			System.out.print("Digite o sexo\nm-Masculino\nf-Feminino\n");
			sexo = input.next().charAt(0);
			}while(Character.compare(sexo, 'm') != 0 && Character.compare(sexo, 'f') != 0);
			
			System.out.print("Digite o salario: ");
			salario = input.nextFloat();
			cont += 1;
			ageAcu += age;
			
			if(Character.compare(sexo, 'm') == 0) {
				salarioAcu += salario;
				contHomem ++;
				
			}else if(salario < 600) {
				contMulher ++;
			}
			
			System.out.print("Digite a idade (negativo para terminar): ");
			age = input.nextInt();
		}	
		
		System.out.printf("Média de idade: %.2f\n", (float)ageAcu/(float)cont);
		System.out.printf("Média de salário homens: %.2f\n", salarioAcu/contHomem);
		System.out.printf("Mulheres com salário abaixo de R$600,00: %d\n", contMulher);
	}
}
