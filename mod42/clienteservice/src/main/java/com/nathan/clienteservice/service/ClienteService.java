package com.nathan.clienteservice.service;

import com.nathan.clienteservice.DTO.ClienteDTO;
import com.nathan.clienteservice.domain.Cliente;
import com.nathan.clienteservice.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    // Salvar
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    // Listar
    public List<Cliente> buscarTodosOsClientes(){
        return clienteRepository.findAll();
    }

    // Buscar por id
    public Optional<Cliente> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }

    // Alterar
    public Cliente atualizarCliente(Long id, Cliente cliente){
        // Buscar cliente
        Optional<Cliente> clienteEncontrado = clienteRepository.findById(id);

        if(clienteEncontrado.isPresent()){
            Cliente clienteParaSerAlterado = clienteEncontrado.get();
            clienteParaSerAlterado.setNome(cliente.getNome());
            clienteParaSerAlterado.setEmail(cliente.getEmail());
            clienteParaSerAlterado.setSenha(cliente.getSenha());
            return clienteRepository.save(clienteParaSerAlterado);
        }

        return null;
    }

    // deletar
    public boolean deletar(Long id){

        // Verificar se o cliente existe
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
        }
        return clienteRepository.existsById(id);

    }
}
