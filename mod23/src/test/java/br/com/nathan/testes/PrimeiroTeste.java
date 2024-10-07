package br.com.nathan.testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void teste() {
        String nome = "Nathan";
        Assert.assertEquals("Nathan", nome);
    }

    @Test
    public void testeNotEquals() {
        String nome = "Nathan";
        Assert.assertNotEquals("Nathan1", nome);
    }

}
