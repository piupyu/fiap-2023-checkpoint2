package dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.fiap.checkpoint2.model.PedidoModel;
import br.com.fiap.checkpoint2.model.ProdutoModel;

public class CriaItemPedidoDTO {
	private PedidoModel pedido;
	private ProdutoModel produto;
	private Integer quantidade;
	private BigDecimal valorTotal;
	

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
