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

import br.com.fiap.checkpoint2.model.PedidoModel;
import br.com.fiap.checkpoint2.service.PedidoService;
import dto.CriaPedidoDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@GetMapping
	public List<PedidoModel> listarPedidos() {
	    return pedidoService.listAll();
	}

	@GetMapping("/{id}")
	public PedidoModel buscarPedidoPorId(@PathVariable Long id) {
	    return pedidoService.findById(id);
	}

	@PostMapping
	public PedidoModel criarPedido(@RequestBody CriaPedidoDTO criaPedido) {
	    return pedidoService.save(criaPedido);
	}

	@PutMapping("/{id}")
	public PedidoModel atualizarPedido(@PathVariable Long id, @RequestBody PedidoModel pedido) {
	    pedido.setId(id);
	    return pedidoService.update(pedido);
	}

	@DeleteMapping("/{id}")
	public void excluirPedido(@PathVariable Long id) {
	    pedidoService.deletaPedido(id);
	}
}