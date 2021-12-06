package desafios;

import java.util.Scanner;

public class Inverte {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Digite a string: ");
		  String texto;
		  
		  texto = sc.next();
		  
		  for (int i = texto.length()-1; i >= 0; i--) {
		   System.out.print(texto.charAt(i));
		  }
		 
		}
		
}
