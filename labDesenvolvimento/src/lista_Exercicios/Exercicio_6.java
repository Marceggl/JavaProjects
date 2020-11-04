//6) Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor
//de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
//outros vetores;
package lista_Exercicios;
import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,iV=0;
		boolean v = true;
		String vet1[] = new String[10];
		String vet2[] = new String[10];
		String vetAll[] = new String[20];		
		for (i = 0;i<20;i++) {
			if(i<10) {
				System.out.print("Digite um valor para o primeiro vetor ("+(i+1)+"/10): ");
				vet1[i] = input.next();
			}else {
				System.out.print("Digite um valor para o segundo vetor ("+(i-9)+"/10): ");
				vet2[i-10] = input.next();
			}		
		}
		
		for (i = 0;i<20;i++) {
			if(v) {
				vetAll[i] = vet1[iV];
				v = false;
				System.out.print(vetAll[i]);
			}else {
				vetAll[i] = vet2[iV];
				v = true;
				iV++;
				System.out.print(vetAll[i]);
			}	
		}
	}
}
