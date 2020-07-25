package com.bolsadeideas.springboot.backend.apirest.models.dao;
import org.springframework.data.repository.CrudRepository;
import com.bolsadeideas.springboot.backend.apirest.models.entity.*;

public interface IClienteDao extends CrudRepository<Cliente, Long> { // se coloca como parametro clase entity y tipo de dato del clave primary

}
