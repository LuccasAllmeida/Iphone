package aparelho.net;

public class navegador implements internet{
    @Override
    public void exibirPagina() {
        System.out.println("Dio | Codifique o seu futuro");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Carregando...");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Pesquisar na Web");
    }
}