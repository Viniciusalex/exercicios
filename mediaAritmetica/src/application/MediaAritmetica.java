package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double numero01 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero02 = sc.nextDouble();
		
		double media = (numero01 + numero02) / 2;
		
		System.out.println("A média dos números é: "+media);
		sc.close();
	}
}
