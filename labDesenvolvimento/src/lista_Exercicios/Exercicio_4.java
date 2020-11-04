//4) Fa�a um Programa que leia 20 n�meros inteiros e armazene-os num vetor. 
//Armazene os n�meros pares no vetor PAR e os n�meros IMPARES no vetor impar. 
//Imprima os tr�s vetores
package lista_Exercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Lista Dinamica
		ArrayList<String> pares = new ArrayList<String>();
		ArrayList<String> impares = new ArrayList<String>();
		//Declara��o variaveis
		int vet[] = new int[20];
		int i;
		//Inicio Processamento
		for(i=0; i<20;i++) {
			System.out.print("Digite um n�mero inteiro ("+(i+1)+"/20):");
			vet[i] = input.nextInt();
			if((vet[i] %2) == 0) {
				pares.add(""+vet[i]);
			}else {
				impares.add(""+vet[i]);
			}
		}
		//Saidas 
		System.out.print("Vetor principal com " + vet.length  + " posi��es: \n|");
		for(i=0;i<20;i++) {
			System.out.print(vet[i] + "|");
		}
		System.out.print("\nVetor par com " + pares.size() +" posi��es: \n|");
		for(i=0;i<pares.size();i++) {
			System.out.print(pares.get(i) + "|");
		}
		System.out.print("\nVetor impar com " + impares.size() +" posi��es: \n|");
		for(i=0;i<impares.size();i++) {
			System.out.print(impares.get(i) + "|");
		}
	}
}