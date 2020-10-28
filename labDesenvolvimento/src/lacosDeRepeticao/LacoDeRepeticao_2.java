package lacosDeRepeticao;

public class LacoDeRepeticao_2 {
	public static void main(String[] args) {
		//controle
		int n;
		//for (n=1; n<=50;n++) {
		//	System.out.printf("%d\n", n);
		//}
		//for (n=52; n<=100;n+=2) {
		//	System.out.printf("%d\n", n);
		//}
		for(n=1;n<=100;n++) {
			if (n<=50 || n %2 == 0) {
				System.out.printf("%d\n", n);
			}
		}
	}
}
