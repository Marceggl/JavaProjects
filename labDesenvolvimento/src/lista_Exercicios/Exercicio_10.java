//10) Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas
//s�o:
//a) "Telefonou para a v�tima?"
//b) "Esteve no local do crime?"
//c) "Mora perto da v�tima?"
//d) "Devia para a v�tima?"
//e) "J� trabalhou com a v�tima?"
//O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime.
//Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita",
//entre 3 e 4 como "C�mplice"e 5 como "Assassino". Caso contr�rio, ele ser� classificado
//como "Inocente".

package lista_Exercicios;
import java.util.Scanner;
public class Exercicio_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int resposta[] = new int[5];
		int i, soma=0;
		//Perguntas
		System.out.print("Telefonou para a v�tima? 1-Sim 0-N�o");
		resposta[0] = input.nextInt();
		System.out.print("Esteve no local do crime? 1-Sim 0-N�o");
		resposta[1] = input.nextInt();
		System.out.print("Mora perto da v�tima? 1-Sim 0-N�o");
		resposta[2] = input.nextInt();
		System.out.print("Devia para a v�tima? 1-Sim 0-N�o");
		resposta[3] = input.nextInt();
		System.out.print("J� trabalhou com a v�tima? 1-Sim 0-N�o");
		resposta[4] = input.nextInt();
		//Soma dos valores
		for(i=0; i<5;i++) {
			soma += resposta[i];
		}
		//Veredito
		if(soma < 2) {
			System.out.print("Inocente");
		}else if(soma == 2) {
			System.out.print("Suspeito");
		}else if(3<= soma && soma <=4 ) {
			System.out.print("C�mplice");
		}else if(soma == 5) {
			System.out.print("Assassino");
		}		
	}
}
