import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class EncomendaTest {
    @Test
    void deveRetornarConteudoEncomenda() {
        var caixa = new Caixa("Caixa vazia");

        var caixaLivros = new Caixa("Caixa de livros");
        var gibiMonica = new Item("Gibi da turma da mônica", new BigDecimal(15));
        caixaLivros.addConteudo(gibiMonica);

        var caixaFerramentas = new Caixa("Caixa com ferramentas");
        var alicate = new Item("Alicate", new BigDecimal(5));
        var regua = new Item("Régua", new BigDecimal(2));
        caixaFerramentas.addConteudo(alicate);
        caixaFerramentas.addConteudo(regua);

        var caixaGrande = new Caixa("Caixa grande");
        caixaGrande.addConteudo(caixa);
        caixaGrande.addConteudo(caixaLivros);
        caixaGrande.addConteudo(caixaFerramentas);

        var encomenda = new Encomenda();
        encomenda.setConteudo(caixaGrande);

        assertEquals(encomenda.getConteudo(), """
                Encomenda: Caixa grande
                Encomenda: Caixa vazia
                Encomenda: Caixa de livros
                Item: Gibi da turma da mônica - R$15
                Encomenda: Caixa com ferramentas
                Item: Alicate - R$5
                Item: Régua - R$2
                """);
    }

    @Test
    void deveRetornarExcecaoEncomendaSemItens() {
        try {
            var encomenda = new Encomenda();
            encomenda.getConteudo();
            fail();
        } catch (NullPointerException ex) {
            assertEquals("Encomenda sem conteúdo", ex.getMessage());
        }
    }
}
