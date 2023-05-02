package br.com.fiap.checkpoint2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.ProdutoModel;
import br.com.fiap.checkpoint2.repository.ProdutoRepository;
import dto.CriaProdutoDTO;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<ProdutoModel> listAll() {
	    return produtoRepository.findAll();
	}

	public ProdutoModel findById(Long id) {
	    ProdutoModel[] produto = new ProdutoModel[1];
	    Optional<ProdutoModel> produtoOp = produtoRepository.findById(id);
	    produtoOp.ifPresent(p -> {
	        produto[0] = p;
	    });

	    return produto[0];
	}

	public ProdutoModel save(CriaProdutoDTO criaProdutoDto) {
	    ProdutoModel produto = new ProdutoModel();
	    produto.setNome(criaProdutoDto.getNome());
	    produto.setPreco(criaProdutoDto.getPreco());
	    produto.setDataValidade(criaProdutoDto.getDataValidade());
	    produto.setDataGarantia(criaProdutoDto.getDataGarantia());
	    produto.setEmEstoque(criaProdutoDto.getEmEstoque());

	    return produtoRepository.save(produto);
	}

	public ProdutoModel update(ProdutoModel updateProduto) {
	    return produtoRepository.save(updateProduto);
	}

	public void deletaProduto(Long id) {
	    ProdutoModel produto = this.findById(id);
	    produtoRepository.delete(produto);
	}

}
