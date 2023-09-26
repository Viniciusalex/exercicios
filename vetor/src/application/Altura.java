package application;

import entities.DadosAltura;

import java.util.Locale;
import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas: ");
		int numeroDePessoas = sc.nextInt(); 
		DadosAltura[] vect= new DadosAltura[numeroDePessoas];
		
		
		for(int i=0;i < vect.length; i++) {
			sc.nextLine();
			int contagem = i + 1;
			System.out.println("Dados da pessoa "+ contagem);
			System.out.println("nome: ");
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new DadosAltura(nome, idade, altura);
		}
		
		double somaDasAlturas = 0;
		
		System.out.printf("Altura média: ");
		for(int i=0;i < vect.length; i++) {
			somaDasAlturas += vect[i].getAltura() / vect.length;
		}
		System.out.println(somaDasAlturas);
		
		double porcentageMenos16Anos = 0;
		
		for(int i=0;i < vect.length; i++) {
			if(vect[i].getIdade() <16) {
				porcentageMenos16Anos = i * 100 / vect.length;
				System.out.println(vect[i].getNome());
			}
		System.out.println("Pessoas com menoss de 16 anos: "+porcentageMenos16Anos);
		}
		
		sc.close();
	}

}
