package entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
	private LocalDate dataFabrificacao;

	public ProdutoUsado(String nome, Double preco, LocalDate dataFabrificacao) {
		super(nome, preco);
		this.dataFabrificacao = dataFabrificacao;
	}


	public LocalDate getDataFabrificacao() {
		return dataFabrificacao;
	}

	public void setDataFabrificacao(LocalDate dataFabrificacao) {
		this.dataFabrificacao = dataFabrificacao;
	}

	@Override
	public String precoEtiqueta() {
		return getNome() 
						+ " (usado) $ " 
						+ String.format("%.2f", precofinal())
						+ " Data de fabrificação: " 
						+ dataFabrificacao.format(DateTimeFormatter.ofPattern("dd/MM/yyy")); 
	}




}
