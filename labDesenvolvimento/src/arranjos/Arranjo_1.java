package arranjos;

public class Arranjo_1 {
	public static void main(String[] args) {
		int A[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		char B[] = {'+','-','*','/','+','-','*','/','+','-','*','/','+','-','*','/','+','-','*','/'};
		int C[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int D[] = new int[20];
		int i;
		
		for(i = 0; i < 20;  i ++) {
			if(Character.compare(B[i], '+') == 0) {
				D[i] = A[i]+C[i];
			}else if(Character.compare(B[i], '-') == 0) {
				D[i] = A[i] - C[i];
			}else if(Character.compare(B[i], '*') == 0) {
				D[i] = A[i] * C[i];
			}else {
				D[i] = A[i] / C[i];
			}
		}
		for(i=0; i<20; i++) {
			System.out.println(A[i] + " " + B[i] + " " + C[i] + " = " + D[i]);
		}
		
	}
}
