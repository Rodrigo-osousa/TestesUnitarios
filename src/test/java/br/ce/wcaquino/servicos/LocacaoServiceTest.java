package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;


import java.util.Date;

public class LocacaoServiceTest{

    @Test
    public void teste() {
        //cenário
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuário 1");
        Filme filme = new Filme("Filme 1", 2, 5.0);


        //ação

        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificação

        //Inverter a ordem de valor esperado e valor  atual não impede de executar o teste, porém atrpalha em identificar a divergência.
        Assert.assertEquals(5.0, locacao.getValor(), 0.01);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(DataUtils.obterDataComDiferencaDias(1), locacao.getDataRetorno()));


    }
}
