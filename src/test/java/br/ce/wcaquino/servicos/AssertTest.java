package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class AssertTest {

    @Test
    public void test(){

        //É possível colocar uma String dentro das assertivas, assim ela é apresentada quando o teste falha.
        // Recebe boolean e valida se é verdadeiro, caso não, retorna erro.
        Assert.assertTrue("Não é Verdadeiro",true);

        // Recebe boolean e valida se é falso, caso não, o teste falha.
        Assert.assertFalse("Não é Falso", false);

        // Compara dois valores, caso sejam diferentes o teste falha.
        Assert.assertEquals("São diferentes",2,2);

        // Compara dois valores, caso não sejam diferentes o teste falha.
        Assert.assertNotEquals("Não são diferentes",5,2);

        // Exemplo com float, tendo  que determinar o delta para a quantidade de  casa decimais a serem  consideradas.
        Assert.assertEquals("São diferentes",0.52,0.52,0.01);

        // Caso não seja  necessário diferenciar maiúsculas de minúsculas.
        Assert.assertTrue("cachorro".equalsIgnoreCase("Cachorro"));

        //Necessário a igualdade das variáveis;
        int g = 10;
        Integer h = 10;
        Assert.assertEquals(Integer.valueOf(g),h);

        //O próprio objeto deve dizer se é ou não igual a outro objeto, procurando o metodo equals do objeto.
        //Apesar de serem iguais, cada usuário possui seu próprio ID o tornando diferentes.
        //Necessário implementar método Equals do objeto na Classe Objeto.
        //Desta forma estamos comparando o nome do abjeto.
        Usuario u1 = new Usuario("Pessoa1");
        Usuario u2 = new Usuario("Pessoa1");
        Usuario u3 = null;

        Assert.assertEquals(u1, u2);

        //Compara se os objetos são da mesma instância.

        //Assert.assertSame(u1, u2); -> Este teste  falha pois os nomes são iguais, porém as instâncias são diferentes.

        //Verifica se o objeto é nulo.
        Assert.assertNull(u3);
        Assert.assertTrue(u3  == null);

    }
}
