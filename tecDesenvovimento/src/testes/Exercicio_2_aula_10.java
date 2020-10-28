package testes;
import java.util.Scanner;

public class Exercicio_2_aula_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float vet[] = new float[11];
		int  i,c=0;
		float M, divi=0, soma=0;
		
		//Adicionar valores ao Array
		for(i=0; i<10; i++) {
			System.out.print("Digite um número inteiro: ");
			vet[i] = input.nextInt();
			
		}
		//Achar o maior valor
		M = vet[0];
		for(i=0; i<9;i++) {
			if(vet[i] > M) {
				M = vet[i];
			}
		}
		//Dividir tudo
		for(i=0; i<10;i++) {
			soma += vet[i];
			divi = soma/M;
		}
		vet[10] = divi;
		
		//Mostrar o vetor
		for(i=0; i<11;i++) {
			c++;
			System.out.printf("Vetor %d vale: %.2f \n", c, vet[i]);
		}
		
	}
}
