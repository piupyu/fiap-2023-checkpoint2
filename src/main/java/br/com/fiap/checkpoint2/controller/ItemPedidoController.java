package br.com.fiap.checkpoint2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.model.ItemPedidoModel;
import br.com.fiap.checkpoint2.service.ItemPedidoService;
import dto.CriaItemPedidoDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/itemPedidos")
public class ItemPedidoController {

	@Autowired
	private ItemPedidoService itemPedidoService;

	@GetMapping
	public List<ItemPedidoModel> listarItensPedido() {
	    return itemPedidoService.listAll();
	}

	@GetMapping("/{id}")
	public ItemPedidoModel buscarItemPedidoPorId(@PathVariable Long id) {
	    return itemPedidoService.findById(id);
	}

	@PostMapping
	public ItemPedidoModel criarItemPedido(@RequestBody CriaItemPedidoDTO criaItemPedido) {
	    return itemPedidoService.save(criaItemPedido);
	}

	@PutMapping("/{id}")
	public ItemPedidoModel atualizarItemPedido(@PathVariable Long id, @RequestBody ItemPedidoModel itemPedido) {
	    itemPedido.setId(id);
	    return itemPedidoService.update(itemPedido);
	}

	@DeleteMapping("/{id}")
	public void excluirItemPedido(@PathVariable Long id) {
	    itemPedidoService.deletaItemPedido(id);
	}
}
