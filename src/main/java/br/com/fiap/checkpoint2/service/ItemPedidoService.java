package br.com.fiap.checkpoint2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.ItemPedidoModel;
import br.com.fiap.checkpoint2.repository.ItemPedidoRepository;
import dto.CriaItemPedidoDTO;

@Service
public class ItemPedidoService {
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	public List<ItemPedidoModel> listAll() {
	    return itemPedidoRepository.findAll();
	}

	public ItemPedidoModel findById(Long id) {
	    ItemPedidoModel[] itemPedido = new ItemPedidoModel[1];
	    Optional<ItemPedidoModel> itemPedidoOp = itemPedidoRepository.findById(id);
	    itemPedidoOp.ifPresent(ip -> {
	        itemPedido[0] = ip;
	    });

	    return itemPedido[0];
	}

	public ItemPedidoModel save(CriaItemPedidoDTO criaItemPedidoDto) {
	    ItemPedidoModel itemPedido = new ItemPedidoModel();
	    itemPedido.setPedido(criaItemPedidoDto.getPedido());
	    itemPedido.setProduto(criaItemPedidoDto.getProduto());
	    itemPedido.setQuantidade(criaItemPedidoDto.getQuantidade());
	    itemPedido.setValorTotal(criaItemPedidoDto.getValorTotal());

	    return itemPedidoRepository.save(itemPedido);
	}

	public ItemPedidoModel update(ItemPedidoModel updateItemPedido) {
	    return itemPedidoRepository.save(updateItemPedido);
	}

	public void deletaItemPedido(Long id) {
	    ItemPedidoModel itemPedido = this.findById(id);
	    itemPedidoRepository.delete(itemPedido);
	}

}
