package com.codingdojo.nathaly.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.nathaly.modelos.Lista;
import com.codingdojo.nathaly.repositorios.RepositorioLookify;

@Service
public class Servicios {
	@Autowired
	private RepositorioLookify repoLookify;
	
	//metodo que regresa una lista con todos los artistas o canciones
	public List<Lista>findLista(){
		return repoLookify.findAll();
	}
	//metodo para guardar canciones
	public Lista saveLista(Lista nuevaCancion) {//guardamos un objeto de direccion
		return repoLookify.save(nuevaCancion);
		
	}
	public void deleteLista(Long id) {
		repoLookify.deleteById(id);
	}
	
	public List<Lista> findTopSongs(){
		return repoLookify.findAllByOrderByClasificacionDesc();
	}
	//select*from Lista where id=<id>
	public Lista findLista(Long id) {
		return repoLookify.findById(id).orElse(null);
	}
}
