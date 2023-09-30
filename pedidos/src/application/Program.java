package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Cliente;
import entites.ItemDoPedido;
import entites.Pedidos;
import entites.Produto;
import enuns.entites.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("INSIRA OS DADOS DO CLIENTE:");
		System.out.println("nome do cliente: ");
		String nome = sc.next();
		System.out.println("E-mail do cliente: ");
		String email = sc.next();
		System.out.println("Data de nascimento do cliente: ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome,email,dataNascimento);
		
		System.out.println("INSIRA OS DADOS DO PEDIDOS:");
		System.out.println("Status(EM_PROCESSAMENTO,\n"
				+ "	ENVIADO,\n"
				+ "	ENTREGUE):");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedidos pedido = new Pedidos(new Date(), status, cliente);
		
		System.out.println("Quantos itens no pedido?");
		int numeroItens = sc.nextInt();
		for(int i = 1;i <= numeroItens; i++) {
			System.out.println("Insira os dados do item"+ i);
			System.out.println("Nome: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			ItemDoPedido it = new ItemDoPedido(quantidade, precoProduto, produto);
			
			
			pedido.addItem(it);
		}
		
		System.out.println();
		System.out.println(pedido);
		
		sc.close();
	}

}
