package entites;

public class ItemDoPedido {
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;
	
	public ItemDoPedido() {
		
	}

	public ItemDoPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double subtotal() {
		return preco * quantidade;
	}

	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return getProduto().getNome()
				+ ", $"
				+ String.format("%.2f", preco)
				+", Quantida "
				+ quantidade
				+ ", subtotal "
				+ subtotal();
	}

	
	
	
	
	
	
	
	
}
