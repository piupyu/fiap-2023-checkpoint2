package br.com.fiap.checkpoint2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.PedidoModel;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import dto.CriaPedidoDTO;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;

	public List<PedidoModel> listAll() {
	    return pedidoRepository.findAll();
	}

	public PedidoModel findById(Long id) {
	    PedidoModel[] pedido = new PedidoModel[1];
	    Optional<PedidoModel> pedidoOp = pedidoRepository.findById(id);
	    pedidoOp.ifPresent(p -> {
	        pedido[0] = p;
	    });

	    return pedido[0];
	}

	public PedidoModel save(CriaPedidoDTO criaPedidoDto) {
	    PedidoModel pedido = new PedidoModel();
	    pedido.setCliente(criaPedidoDto.getCliente());
	    pedido.setDataPedido(criaPedidoDto.getDataPedido());

	    return pedidoRepository.save(pedido);
	}

	public PedidoModel update(PedidoModel updatePedido) {
	    return pedidoRepository.save(updatePedido);
	}

	public void deletaPedido(Long id) {
	    PedidoModel pedido = this.findById(id);
	    pedidoRepository.delete(pedido);
	}

}
