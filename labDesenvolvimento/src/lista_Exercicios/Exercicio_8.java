//Fa�a um programa que carregue uma lista com os modelos de cinco carros (exemplo de modelos: FUSCA, GOL, VECTRA etc). 
//Carregue uma outra lista com o consumo desses carros, isto �, quantos quil�metros cada um desses carros faz com um litro de combust�vel.
//Calcule e mostre:
//a) O modelo do carro mais econ�mico;
//b) Quantos litros de combust�vel cada um dos carros cadastrados consome para percorrer
//uma dist�ncia de 1000 quil�metros e quanto isto custar�, considerando um que a gasolina custe R$ 2,25 o litro.
package lista_Exercicios;

public class Exercicio_8 {
	public static void main(String[] args) {
	//Modelo dos carros
	String modelos[] = {"Fusca", "Virtus", "Uno", "Fox", "Cronos"};
	//Consumo dos carros
	double consumo[] = { 7, 9.8, 8.9, 9.5, 12.4 };
	//Custo combustivel
	float custo, gasto, menor=0;
	//Variavel de controle
	int i, menorCons=0;
	//Inicio processamento mais impress�o na tela (console)
	System.out.print("Comparativo de consumo de combusivel:\n------------------\n\n");
	for(i=0;i<5;i++) {
		//Impressao dos dados
		System.out.print("Veiculo " + (i+1) + "\nNome: " + modelos[i] + "\nConsumo (km/l): " + consumo[i] +"\n------------\n");
	}
	//Relat�rio final
	System.out.print("Relat�rio final\n------------\n\n");
	for(i=0;i<5;i++) {
		custo = (float) (1000/consumo[i]);
		gasto = (float) (custo*2.25);
		System.out.printf("%d - %s - %.2f - %.2f Litros - %.2f \n", (i+1), modelos[i], consumo[i], custo, gasto);
		//Achar o mais econ�mico
		if(menor < consumo[i]) {
			menor = (float) consumo[i];
			menorCons = i;
		}
	}
	System.out.print("O carrp mais econ�mico �: " + modelos[menorCons]);
	}
}
