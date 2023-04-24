import java.util.ArrayList;
import java.util.List;

public class Caixa extends Conteudo {
    private final List<Conteudo> conteudos;

    public Caixa(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    @Override
    public String getConteudo() {
        var conteudos = new StringBuilder("Encomenda: " + this.getDescricao() + "\n");
        for (var conteudo : this.conteudos) {
            conteudos.append(conteudo.getConteudo());
        }

        return conteudos.toString();
    }
}
