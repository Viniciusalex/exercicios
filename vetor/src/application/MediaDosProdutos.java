package application;

import entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class MediaDosProdutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroDeProdutos = sc.nextInt();
		Produtos[] vect = new Produtos[numeroDeProdutos];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			
			vect[i] = new Produtos(nome, preco);
		}
		
		double somaDosValores = 0;
		
		for(int i= 0;i<vect.length;i++) {
			somaDosValores += vect[i].getPreco();
		}
		
		double resultadoDaMedia = somaDosValores / numeroDeProdutos;
		
		System.out.printf("O valor médio dos produtos são de %.2f%n", resultadoDaMedia);
		
		sc.close();
	}

}
