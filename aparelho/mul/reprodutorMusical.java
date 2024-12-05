package aparelho.mul;

public class reprodutorMusical implements multimidia{
    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo: MC Caverinha, Kayblack, Wall Hein - Cartão Black (Clipe Oficial)");
    }

    @Override
    public void pausar() {
        System.out.println("Press Start para continuar");
    }

    @Override
    public void selecao() {
        System.out.println("Selecione uma musica");
    }

    @Override
    public void start() {
        System.out.println("Press Stop para pausar");
    }
}
