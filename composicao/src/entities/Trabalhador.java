package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double baseSalario;
	
	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();
	
	public Trabalhador(){
		
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double baseSalario, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}
	
	public void adicionarContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double rendaMes(int ano,int mes) {
		double somaTotal = baseSalario;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato i: contratos) {
			cal.setTime(i.getData());
			int i_ano = cal.get(Calendar.YEAR);
			int i_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == i_ano && mes == i_mes ) {
				somaTotal += i.valorTotal();
			}
			
		}
		return somaTotal;
	}
}
