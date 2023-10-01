package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Funcionario;
import entites.FuncionarioTercerizado;

public class Program {

	public static void main(String[] args) {
		
		List<Funcionario> list = new ArrayList<>(); 
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o número de funcionarios: ");
		int numeroFuncionarios = sc.nextInt();
		
		for (int i=1;i <= numeroFuncionarios;i++) {
			System.out.println("O funcionario é tercerizado(y/n)?");
			char opcaoEscolhida = sc.next().charAt(0);
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.println("valor da hora trabalhada: ");
			double valorPorHora = sc.nextDouble();
			if (opcaoEscolhida == 'n') {
				Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
				list.add(funcionario);
			}else {
				System.out.println("Informe valor adicional: ");
				double cobrancaAdicional = sc.nextDouble();
				Funcionario funcionario = new FuncionarioTercerizado(nome,horas,valorPorHora,cobrancaAdicional);
				list.add(funcionario);
			}
		}
		
		for(Funcionario lista : list) {
			System.out.println(lista.getNome() + " - " + String.format("%.2f", lista.pagamento()));
		}
		
		sc.close();
	}
}
