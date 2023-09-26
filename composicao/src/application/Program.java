package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Insira os dados do trbalhador: ");
		System.out.println("nome: ");
		String nomeTrbalhador = sc.nextLine();
		System.out.println("Insira o nivel do trabalhor:");
		String nivelTrbalhador = sc.nextLine();
		System.out.println("Insira a base salarial: ");
		double baseSalario = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrbalhador,NivelTrabalhador.valueOf(nivelTrbalhador) , baseSalario, new Departamento(nomeDepartamento));
		
		System.out.println("Quantos contratos para esse trabalhador? ");
		Integer numeroContratos = sc.nextInt();
		
		for (int i=1; i <= numeroContratos; i++) {
			System.out.println("Insira o dados do contrato #"+ i + "data");
			System.out.println("data DD/MM/YYYY");
			Date dataContrato = sdf.parse(sc.next());
			System.out.println("Informe o valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.println("Informe a duração(horas):");
			Integer duracaoHoras = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato, valorHora, duracaoHoras);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println("Insira o mes para calcular a renda (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: "+trabalhador.getNome());
		System.out.println("Departamento: "+trabalhador.getDepartamento().getName());
		System.out.println("A rensa para a data " + mesEAno + ":" + String.format("%.2f",trabalhador.rendaMes(ano, mes)));
		
				
				
	}

}
