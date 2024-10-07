package br.com.nathan.testes;

import br.com.nathan.examples.Cliente;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTests {

    @Test
    public void testeClasseCliente(){
        Cliente cli = new Cliente();
        cli.setNome("Nathan");

        Assert.assertEquals("Nathan", cli.getNome());

    }

}
