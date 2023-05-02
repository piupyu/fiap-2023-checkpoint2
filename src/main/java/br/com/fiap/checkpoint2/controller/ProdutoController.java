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

import br.com.fiap.checkpoint2.model.ProdutoModel;
import br.com.fiap.checkpoint2.service.ProdutoService;
import dto.CriaProdutoDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<ProdutoModel> listarProdutos() {
	    return produtoService.listAll();
	}

	@GetMapping("/{id}")
	public ProdutoModel buscarProdutoPorId(@PathVariable Long id) {
	    return produtoService.findById(id);
	}

	@PostMapping
	public ProdutoModel criarProduto(@RequestBody CriaProdutoDTO criaProduto) {
	    return produtoService.save(criaProduto);
	}

	@PutMapping("/{id}")
	public ProdutoModel atualizarProduto(@PathVariable Long id, @RequestBody ProdutoModel produto) {
	    produto.setId(id);
	    return produtoService.update(produto);
	}

	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable Long id) {
	    produtoService.deletaProduto(id);
	}
}