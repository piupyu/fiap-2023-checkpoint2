package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "itens_pedidos")
public class ItemPedidoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sequencia")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "numero_pedido")
	private PedidoModel pedido;

	@ManyToOne
	@JoinColumn(name = "codigo_produto")
	private ProdutoModel produto;

	@Column(name = "quantidade")
	private Integer quantidade;

	@Column(name = "valor_total")
	private BigDecimal valorTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PedidoModel getPedido() {
		return pedido;
	}

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}

	public ProdutoModel getProduto() {
		return produto;
	}

	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
