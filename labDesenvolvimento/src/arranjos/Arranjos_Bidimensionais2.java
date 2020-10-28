package arranjos;
import java.util.Scanner;
public class Arranjos_Bidimensionais2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float M[][] = new float [12][12];
	    char T;
	    int i, j, CONT = 0;
	    float SOMA = 0;
	    System.out.print("S - soma, M - média: ");
	    T = input.next().charAt(0);

	    for(i = 0 ; i < 12 ; i ++){
	      for(j = 0 ; j < 12 ; j ++){
	        M[i][j] = i + j;
	      }
	    }

	    for(i = 0 ; i < 12 ; i ++){
	      for(j = 0 ; j < 12 ; j ++){
	        if(j > i){
	          SOMA = SOMA + M[i][j];
	          CONT = CONT + 1;
	          System.out.printf("%2.2f ",M[i][j]);
	        }else{
	          System.out.printf("00.00 ");
	        }
	      }
	      System.out.printf("\n");
	    }

	    if(Character.compare('M', T) == 0){
	      System.out.printf("Média: %.2f\n",(SOMA/CONT));
	    }else{
	      System.out.printf("Soma: %.2f\n",SOMA);
	    }
	    
	  }
	} 