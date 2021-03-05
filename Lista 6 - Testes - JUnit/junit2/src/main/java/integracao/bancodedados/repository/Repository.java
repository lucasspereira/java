package integracao.bancodedados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import integracao.bancodedados.model.ContatoModel;
	
	public interface Repository extends JpaRepository<ContatoModel, Long> {


}
