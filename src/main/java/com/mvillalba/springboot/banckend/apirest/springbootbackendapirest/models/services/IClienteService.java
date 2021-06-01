package com.mvillalba.springboot.banckend.apirest.springbootbackendapirest.models.services;

import com.mvillalba.springboot.banckend.apirest.springbootbackendapirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

}
