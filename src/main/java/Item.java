import java.math.BigDecimal;

public class Item extends Conteudo {
    private BigDecimal preco;

    public Item(String descricao, BigDecimal preco) {
        super(descricao);
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String getConteudo() {
        return "Item: " + this.getDescricao() + " - R$" + this.preco + "\n";
    }
}
