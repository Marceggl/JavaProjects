package estudo;
import java.util.Scanner;

public class Ex3Modulos {
	static String juros(float a, int b) {
		double juros;
		
		juros = (a*1.05);
		return "Sua compra ter� 5% de juros e sair� por R$" + juros + " se parcelado em " + b; 
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float vlCompraUser;
		int qtdParcUser, verif;
		
		System.out.print("Digite o valor da compra: ");
		vlCompraUser = input.nextFloat();
		System.out.print("Sua compra ser� parcelada ou a vista ? \n1-A vista\n2- Parcelado");
		verif = input.nextInt();
		
		
		if (verif == 1) {
			System.out.printf("Sua compra ser� a vista e sair� por R$" + vlCompraUser);
		}else if(verif == 2) {
			System.out.print("Digite a quantidade de parcelas: ");
			qtdParcUser = input.nextInt();
			
			System.out.print(juros(vlCompraUser, qtdParcUser));
		}else {
			System.out.print("Voc� n�o digitou um c�digo de compra v�lido");
		}
	}
}
