package desafios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

/* o programa executara ate o 10 termo da serie de fibonacci 
 * o usuario devera inserir um numero e se ele estiver na sequencia de fibonnaci ele avisa o usuario que esta contido na sequencia 		
 */
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero para verificar: ");
		num = sc.nextInt();
		
		int num1 = 1,num2 =0;
		
		for(int i =0; i<8;i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			if(num == num1) {
				System.out.println("numero digitado contido na sequencia");
			}
				
			
		}

		

	}

}
