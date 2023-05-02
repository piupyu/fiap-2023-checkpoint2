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

import br.com.fiap.checkpoint2.model.ClienteModel;
import br.com.fiap.checkpoint2.service.ClienteService;
import dto.CriaClienteDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<ClienteModel> listarClientes() {
		return clienteService.listAll();
	}

	@GetMapping("/{id}")
	public ClienteModel buscarClientePorId(@PathVariable Long id) {
		return clienteService.findById(id);
	}

	@PostMapping
	public ClienteModel criarCliente(@RequestBody CriaClienteDTO criaCliente) {
		return clienteService.save(criaCliente);
	}

	@PutMapping
	public ClienteModel atualizarCliente(@PathVariable Long id, @RequestBody ClienteModel cliente) {
		return clienteService.update(cliente);
	}

	@DeleteMapping("/{id}")
	public void excluirCliente(@PathVariable Long id) {
		clienteService.deletaCliente(id);
	}
}
