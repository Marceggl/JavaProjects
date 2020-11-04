//4) Faça um Programa que leia 20 números inteiros e armazene-os num vetor. 
//Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. 
//Imprima os três vetores
package lista_Exercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Lista Dinamica
		ArrayList<String> pares = new ArrayList<String>();
		ArrayList<String> impares = new ArrayList<String>();
		//Declaração variaveis
		int vet[] = new int[20];
		int i;
		//Inicio Processamento
		for(i=0; i<20;i++) {
			System.out.print("Digite um número inteiro ("+(i+1)+"/20):");
			vet[i] = input.nextInt();
			if((vet[i] %2) == 0) {
				pares.add(""+vet[i]);
			}else {
				impares.add(""+vet[i]);
			}
		}
		//Saidas 
		System.out.print("Vetor principal com " + vet.length  + " posições: \n|");
		for(i=0;i<20;i++) {
			System.out.print(vet[i] + "|");
		}
		System.out.print("\nVetor par com " + pares.size() +" posições: \n|");
		for(i=0;i<pares.size();i++) {
			System.out.print(pares.get(i) + "|");
		}
		System.out.print("\nVetor impar com " + impares.size() +" posições: \n|");
		for(i=0;i<impares.size();i++) {
			System.out.print(impares.get(i) + "|");
		}
	}
}