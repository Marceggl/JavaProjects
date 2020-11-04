//3) Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes
package lista_Exercicios;
import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char vet[] = new char[10];
		int consoantes = 0, vogais = 0;
		int i;
		for(i=0; i<10; i++) {
			System.out.print("digite uma letra: ");
			vet[i] = input.next().charAt(0);
		}
		for(i=0; i<10;i++) {
			if(vet[i] != 'a' && vet[i] != 'e' && vet[i] != 'i' && vet[i] != 'o' && vet[i] != 'u') {
				consoantes ++;
			}else {
				vogais ++;
			}
		}
		System.out.print("Número de consoantes encontradas: " + consoantes + "\n");
		System.out.print("Número de vogais encontradas: " + vogais + "\n");
		
	}
}
