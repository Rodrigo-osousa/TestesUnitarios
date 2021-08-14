package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void test(){
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertEquals(2,2);
        Assert.assertEquals(0.52,0.52,0.01);
    }
}
