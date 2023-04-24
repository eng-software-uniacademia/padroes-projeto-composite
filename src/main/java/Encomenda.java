public class Encomenda {
    private Conteudo conteudo;

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        if (this.conteudo == null) {
            throw new NullPointerException("Encomenda sem conteúdo");
        }

        return this.conteudo.getConteudo();
    }
}
