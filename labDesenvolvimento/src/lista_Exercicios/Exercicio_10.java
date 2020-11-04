//10) Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas
//são:
//a) "Telefonou para a vítima?"
//b) "Esteve no local do crime?"
//c) "Mora perto da vítima?"
//d) "Devia para a vítima?"
//e) "Já trabalhou com a vítima?"
//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
//Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
//entre 3 e 4 como "Cúmplice"e 5 como "Assassino". Caso contrário, ele será classificado
//como "Inocente".

package lista_Exercicios;
import java.util.Scanner;
public class Exercicio_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int resposta[] = new int[5];
		int i, soma=0;
		//Perguntas
		System.out.print("Telefonou para a vítima? 1-Sim 0-Não");
		resposta[0] = input.nextInt();
		System.out.print("Esteve no local do crime? 1-Sim 0-Não");
		resposta[1] = input.nextInt();
		System.out.print("Mora perto da vítima? 1-Sim 0-Não");
		resposta[2] = input.nextInt();
		System.out.print("Devia para a vítima? 1-Sim 0-Não");
		resposta[3] = input.nextInt();
		System.out.print("Já trabalhou com a vítima? 1-Sim 0-Não");
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
			System.out.print("Cúmplice");
		}else if(soma == 5) {
			System.out.print("Assassino");
		}		
	}
}
