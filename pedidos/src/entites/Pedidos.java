package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enuns.entites.StatusPedido;

public class Pedidos {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	
	private Date momento;
	private StatusPedido statusPedido;
	
	public Cliente cliente;
	
	private List<ItemDoPedido> itens = new ArrayList<ItemDoPedido>(); 

	public Pedidos() {
		
	}


	public Pedidos(Date momento, StatusPedido statusPedido, Cliente cliente) {
		this.momento = momento;
		this.statusPedido = statusPedido;
		this.cliente = cliente;
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public StatusPedido getStatusPedido() {
		return statusPedido;
	}


	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<ItemDoPedido> getItens() {
		return itens;
	}


	public void setItens(List<ItemDoPedido> itens) {
		this.itens = itens;
	}

	public void removendoItem(ItemDoPedido item){
		itens.remove(item);
	}
	
	public void addItem(ItemDoPedido item){
		itens.add(item);
	}
	
	public double total() {
		double soma = 0;
		for (ItemDoPedido item : itens) {
			soma += item.subtotal();
		}
		return soma;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento)+ "\n");
		sb.append("Status do pedido: ");
		sb.append(statusPedido + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Ordem dos Itens:\n");
		for(ItemDoPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
}
