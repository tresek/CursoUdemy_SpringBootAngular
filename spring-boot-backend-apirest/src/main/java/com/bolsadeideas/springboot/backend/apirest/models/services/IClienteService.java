package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.*;
import java.util.List;

public interface IClienteService {
	//aqui se construyen los metodos que interactuan con la clase Dao
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete (Long id);
		
	

}
