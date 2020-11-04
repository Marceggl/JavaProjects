//9 - Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo. 
//Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
//– 326 = 3 centenas, 2 dezenas e 6 unidades;
//– 12 = 1 dezena e 2 unidades;
//Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16.

package lista_Exercicios;
import java.util.Scanner;
public class Exercicio_9 {
	//Processamento
	public static void processo(int x) {
		int centena, dezena, unidade;
		//Achar unidade
		unidade = x%10;
		//Tirar o ultimo digito
		x = (x-unidade)/10;
		//Achar a Dezena
		dezena = x%10;
		//Tirar o ultimo digito e acha a centena
		x = (x-dezena)/10;
		centena = x;
		System.out.printf("%d Centena(s), %d Dezena(s) e %d unidade(s)",centena, dezena, unidade);
	}
	//Entrada
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int z;
		System.out.print("Digite um número inteiro: ");
		z = input.nextInt();
		if(z < 1000) {processo(z);}else {System.out.print("Digite um número menor que 1000");}
	}
}
