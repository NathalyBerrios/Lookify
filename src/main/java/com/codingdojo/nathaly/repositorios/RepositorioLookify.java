package com.codingdojo.nathaly.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.nathaly.modelos.Lista;


@Repository
public interface RepositorioLookify extends CrudRepository<Lista, Long>{
	List<Lista> findAll();
	
	//buscar por artista
	List<Lista> findByArtista(String artista);
	
	//guarda una nueva cancion
	Lista save(Lista nuevacancion);
	
	//ordenar por top songs
	 List<Lista> findAllByOrderByClasificacionDesc();
	 
	//eliminar una cancion
	void deleteById(Long id);
}
