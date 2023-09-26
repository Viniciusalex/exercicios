package application;

import java.util.Locale;
import java.util.Scanner;

public class AlturaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int numerosDePessoas = sc.nextInt();
		double [] vect = new double[numerosDePessoas];
		
		for(int i = 0; i<numerosDePessoas; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double somaDasAlturas = 0;
			for (int i = 0; i < numerosDePessoas; i++) {
				somaDasAlturas += vect[i];
			}
		double resultado = somaDasAlturas / numerosDePessoas;
		
		System.out.printf(" A média das alturas é de %.2f%n", resultado);
			
		sc.close();

	}

}
