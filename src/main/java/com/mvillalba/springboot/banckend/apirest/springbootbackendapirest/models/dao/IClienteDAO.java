package com.mvillalba.springboot.banckend.apirest.springbootbackendapirest.models.dao;

import com.mvillalba.springboot.banckend.apirest.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDAO extends CrudRepository<Cliente, Long> {
}
