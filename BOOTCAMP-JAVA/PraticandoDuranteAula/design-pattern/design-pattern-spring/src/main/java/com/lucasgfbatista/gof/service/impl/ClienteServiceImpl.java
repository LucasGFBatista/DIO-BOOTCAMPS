package com.lucasgfbatista.gof.service.impl;

/*
 * Implementação da <b>Strategy<b> {@link ClienteService}, qual pode ser injetada
 * pelo Spring (via {@link Autowired}. Com isso, como essa classe é um
 * {@link Service}, ela será tratadda como um <b>Singleton</b>
 *
 * @author lucasgfbatista
 *
 * */


import com.lucasgfbatista.gof.model.Cliente;
import com.lucasgfbatista.gof.model.Endereco;
import com.lucasgfbatista.gof.repository.ClienteRepository;
import com.lucasgfbatista.gof.repository.EnderecoRepository;
import com.lucasgfbatista.gof.service.ClienteService;
import com.lucasgfbatista.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {


    @Autowired
    ViaCepService viaCepService;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }


    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clientebd = clienteRepository.findById(cliente.getId());
        if (clientebd.isPresent()) {

            salvarClienteComCep(cliente);

        }
    }

    @Override
    public void remover(Long id) {
        clienteRepository.deleteById(id);
    }


    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();

        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {

            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}
