package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_produto")
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "preco")
	private BigDecimal preco;

	@Column(name = "data_validade")
	private LocalDate dataValidade;

	@Column(name = "data_garantia")
	private LocalDate dataGarantia;

	@Column(name = "em_estoque")
	private Boolean emEstoque;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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