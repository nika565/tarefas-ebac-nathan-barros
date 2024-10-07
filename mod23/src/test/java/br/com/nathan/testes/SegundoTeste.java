package br.com.nathan.testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {

    @Test
    public void teste2() {
        String nome = "Nathan";
        Assert.assertEquals("Nathan", nome);
    }

}
