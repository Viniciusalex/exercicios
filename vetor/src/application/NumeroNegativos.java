package application;

import java.util.Locale;
import java.util.Scanner;

public class NumeroNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int quantidaNumerosDigitas = sc.nextInt();
		
		double[] vect = new double[quantidaNumerosDigitas];
		
		for (int i = 0; i< vect.length;i++) {
			vect[i] = sc.nextInt();
		}
		
		
		System.out.println("Números negativos:");
		for (int i = 0; i < vect.length;i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();

	}

}
