package dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;

public class CriaProdutoDTO {
	private String nome;
	private BigDecimal preco;
	private LocalDate dataValidade;
	private LocalDate dataGarantia;
	private Boolean emEstoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	public LocalDate getDataGarantia() {
		return dataGarantia;
	}
	public void setDataGarantia(LocalDate dataGarantia) {
		this.dataGarantia = dataGarantia;
	}
	public Boolean getEmEstoque() {
		return emEstoque;
	}
	public void setEmEstoque(Boolean emEstoque) {
		this.emEstoque = emEstoque;
	}
	
	
}
