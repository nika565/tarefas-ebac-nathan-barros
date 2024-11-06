package com.nathan.clienteservice.controller;

import com.nathan.clienteservice.DTO.ClienteDTO;
import com.nathan.clienteservice.domain.Cliente;
import com.nathan.clienteservice.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.buscarTodosOsClientes();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> retornaClientePeloID(@PathVariable Long id){
        return clienteService.buscarPorId(id);
    }

    @PostMapping
    public Cliente salvarCliente(@RequestBody ClienteDTO cliente){
        Cliente novoCliente = new Cliente();
        novoCliente.setNome(cliente.nome());
        novoCliente.setEmail(cliente.email());
        novoCliente.setSenha(cliente.senha());
        return clienteService.salvar(novoCliente);
    }

    @PutMapping("/{id}")
    public Cliente editarCliente(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.nome());
        cliente.setEmail(clienteDTO.email());
        cliente.setSenha(clienteDTO.senha());
        return clienteService.atualizarCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public String deletarCliente(@PathVariable Long id){
        // Deleta e verifica se o cliente ainda existe no banco de dados
        boolean verificacaoDeExistencia = clienteService.deletar(id);
        if(verificacaoDeExistencia) return "Não possível deletar o cliente com o ID: " + id;
        return "O Cliente foi deletado com sucesso!";
    }

}
