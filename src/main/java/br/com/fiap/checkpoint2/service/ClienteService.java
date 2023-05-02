package br.com.fiap.checkpoint2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.ClienteModel;
import br.com.fiap.checkpoint2.repository.ClienteRepository;
import dto.CriaClienteDTO;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public List<ClienteModel> listAll() {
		return clienteRepository.findAll();
	}
	
	public ClienteModel findById(Long id) {
		ClienteModel[] cliente = new ClienteModel[1];
		Optional<ClienteModel> clienteOp = clienteRepository.findById(id);
		clienteOp.ifPresent(c -> {
			cliente[0] = c;
		});
		
		return cliente[0];
	}
	
	public ClienteModel save(CriaClienteDTO criaClienteDto) {
		ClienteModel cliente = new ClienteModel();
		cliente.setNome(criaClienteDto.getNome());
		cliente.setCep(criaClienteDto.getCep());
		cliente.setInscricaoFederal(criaClienteDto.getInscricaoFederal());
		
		return clienteRepository.save(cliente);
	}
	
	public ClienteModel update(ClienteModel updateCliente) {
		return clienteRepository.save(updateCliente);
	}
	
	public void deletaCliente(Long id) {
		ClienteModel cliente = this.findById(id);
		clienteRepository.delete(cliente);
	}
}
