//2) Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
package lista_Exercicios;
import java.util.Scanner;
public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float vet[] = new float[10];
		int i;
		for(i=0;i<10;i++) {
			System.out.print("Digite um número real: ");
			vet[i] = input.nextFloat();
		}
		for(i=vet.length-1; i >= 0; i--) {System.out.println(vet[i]);}
	}
}
