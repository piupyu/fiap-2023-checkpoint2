package dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

import br.com.fiap.checkpoint2.model.ClienteModel;

public class CriaPedidoDTO {
	private ClienteModel cliente;
	private LocalDate dataPedido;
	
	public ClienteModel getCliente() {
		return cliente;
	}
	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	
}
