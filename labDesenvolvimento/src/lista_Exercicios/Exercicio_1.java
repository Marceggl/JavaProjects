//1) Fa�a um Programa que leia um vetor de 5 n�meros inteiros e mostre-os
package lista_Exercicios;
import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vet[] = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("Digite um n�mero inteiro: ");
			vet[i] = input.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.print("Valor " + (i+1) + " � " + vet[i] + "\n");
		}
	}
}
