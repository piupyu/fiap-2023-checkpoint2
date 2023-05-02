package br.com.fiap.checkpoint2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint2.model.ClienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{

}
