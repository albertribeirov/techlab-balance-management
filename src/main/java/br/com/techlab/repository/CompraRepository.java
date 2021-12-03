package br.com.techlab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.techlab.model.Compra;

@Repository
public interface CompraRepository extends MongoRepository<Compra, Long>{

}
