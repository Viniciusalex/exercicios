package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Produto;
import entites.ProdutoImportado;
import entites.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("Informe o numero de produtos: ");
		int quantidadeProdutos = sc.nextInt();
		
		for (int i=1;i <= quantidadeProdutos;i++) {
			System.out.println("Comum, usado ou importado (c/u/i)? ");
			char opcaoEscolhida = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Preço: ");
			double preco = sc.nextDouble();
			
			if (opcaoEscolhida == 'i') {
				System.out.println("Preço do frete");
				double precoFrete = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, precoFrete));
				
				
			}else if(opcaoEscolhida == 'u'){
				System.out.println("Data de fabricação: ");
				LocalDate dataFabricacao = LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
				
			}else {
				lista.add(new Produto(nome, preco));
				
			}
		}
		System.out.println();
		System.out.println("Etiquetas de preço:");
		for (Produto list: lista) {
			System.out.println(list.precoEtiqueta());
		}
		
		sc.close();
	}
}
