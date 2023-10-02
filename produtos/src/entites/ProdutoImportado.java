package entites;

public class ProdutoImportado extends Produto{
	private Double precoFrete;
	
	public ProdutoImportado() {
		super();
	}

	

	public ProdutoImportado(String nome, Double preco, Double precoFrete) {
		super(nome, preco);
		this.precoFrete = precoFrete;
	}

	public Double getPrecoFrete() {
		return precoFrete;
	}

	public void setPrecoFrete(Double precoFrete) {
		this.precoFrete = precoFrete;
	}
	
	@Override
	public final double precofinal() {
		return preco + precoFrete;
	}

	@Override
	public String precoEtiqueta() {
		return getNome() 
				+ " $ " 
				+ String.format(" %.2f ", precofinal()) 
				+ (" Preço do frete: $ ")
				+ String.format(" %.2f ", precoFrete);
	}

}
	
