package com.tablero.tablero.repo;

import com.tablero.tablero.model.Nota;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioNota extends MongoRepository<Nota, String> {
    /**
     * Metodo para buscar una nota segun si id
     * 
     * @param idNota
     * @return Nota
     */
    public Nota findByIdNota(String idNota);
}
