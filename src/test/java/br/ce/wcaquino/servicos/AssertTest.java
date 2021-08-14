package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void test(){
        Assert.assertTrue(true); // Recebe boolean e valida se é verdadeiro, caso não, retorna erro.
        Assert.assertFalse(false); // Recebe boolean e valida se é falso, caso não, retorna erro.
        Assert.assertEquals(2,2); // Compara dois valores, caso sejam diferentes retorna erro.
        Assert.assertEquals(0.52,0.52,0.01); // Exemplo com float, tendo  que determinar o delta para a quantidade de  casa decimais a serem  consideradas.

    }
}
