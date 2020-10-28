package estudo;
import java.util.Scanner;


public class Al5_ex1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int age;
		
		System.out.print("Digite a idade do competidor: ");
		age = input.nextInt();
		
		if (age > 4 && age < 8) {
			System.out.print("Participará da categoria Infantil A");
		}else {
			if(age > 7 && age < 11) {
				System.out.print("Participará da categoria Infantil B");
			}else {
				if(age > 10 && age < 14) {
					System.out.print("Participará da categoria Juvenil A");
				}else {
					if(age>13 && age <18) {
						System.out.print("Participará da categoria Juvenil B");
					}else {
						if(age>17) {
							System.out.print("Participará da categoria Adulto");
						}
					}
				}
			}
		}
	}
}
