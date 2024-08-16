package com.lucasgfbatista.gof.service;

import com.lucasgfbatista.gof.model.Cliente;

/*
* Interface que define o padrão <b>Strategy</b> no domiminio cliente. Com
* isso, se faz necessario, podemos ter multiplas implementações dessa mesma interface.
*
* @author lucasgfbatista
* */


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void remover(Long id);


}
