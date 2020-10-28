package arranjos;

public class Arranjo_2 {
	public static void main  (String[] args) {
		int A[] = {1,2,3,4,5,6,7};
		int B[] = {1,2,3,4,5,6,7};
		int C[] = new int[7];
		int x = 3;
		int i;
		
		
		for(i = 0 ; i < 7; i++) {
			if(i % 2 == 0) {
				x = x + i;
				C[x] = A[i] * B[6 - i];	
			}else {
				x = x - i;
				C[x] = A[i] * B[6 - i];
			}
		}
		for(i = 0; i < 7; i++) {
			System.out.print(C[i] + "\n");
		}
	}
}
