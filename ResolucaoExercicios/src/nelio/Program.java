package nelio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double media = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("qual o tamanho do vetor ? ");
			int n = sc.nextInt();
			double [] vect = new double[n];
				for (int a=0; a < n;a++) {
					System.out.printf(" Digite o valor do vetor da posição %d%n",a);
					vect[a] = sc.nextDouble();
					media += vect[a];
					
				}
				
				
				double resu = media / n;
				sc.close();
			System.out.format("a media das altura é %.2f" , resu);
							
				
		}
		
		

	}


