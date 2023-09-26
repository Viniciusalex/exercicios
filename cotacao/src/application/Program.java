package application;

import util.Convercao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****** Converção de dolar *********");
		
		
		System.out.println("Informe qual a cotação do dólar hoje: ");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Informe quantos dólares deseja comprar: ");
		double quantidadeDesejada = sc.nextDouble();
		
		System.out.println("Taxa IOF estar 6% hoje!");
		
		double resultado = Convercao.valorDaConversao(valorDolar, quantidadeDesejada);
		
		System.out.println("Você tem que pagar em reais o valor de: " + resultado);
		
		System.out.println("Deseja efetuar o pagamento? S/N");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Compra efetuada com sucesso!");
		}else{
			System.out.println("Que pena! Volte sempre.!");
			
			
		sc.close();
		}

	}

}
