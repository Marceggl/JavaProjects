package testes;
import java.lang.Math;

public class Exercicio_1aula_10 {
	public static void main (String[] args) {
		int vet[] = new int[366];
		int i, c = 0, maior, menor, soma = 0;
		float media;
		//gerar n�meros aleat�rios
		for(i=0;i<364; i++) {
			vet[i] = (int)(Math.random()*100)+1;
			soma += vet[i];
		}
		//Atribuir valor maior e menor
		maior = vet[0];
		menor = vet[0];
		for (i=0; i<364; i++) {
			if(vet[i] < menor){menor = vet[i];}
			if(vet[i] > maior) {maior = vet[i];}		
		}
		//Contar quantos dias passaram da m�dia
		vet[365] = soma/365;
		for (i=0; i<364; i++) {
			if(vet[i] > vet[365]) {
				c ++;
			}
		}
		//Escrever na tela
		System.out.print("A m�dia das vendas �: " + vet[365] + "\n");
		System.out.print("A quantidade de dias que passaram da m�dia foi: " + c + "\n");
		System.out.print("Maior n�mero " + maior +"\n");
		System.out.print("Menor n�mero " +menor+"\n");
	}
}
