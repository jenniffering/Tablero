package com.tablero.tablero.repo;

import com.tablero.tablero.model.Nota;

import java.util.List;
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

	/**
	 * Metodo para buscar las notas que pertenenen a un autor
	 * 
	 * @param autor
	 * @return lista de notas
	 */
	public List<Nota> findByAutor(String autor);

	/**
	 * Metodo para contar cuantas notas pertenecen a un autor
	 * 
	 * @param autor
	 * @return
	 */
	public Long countByAutor(String autor);
}
