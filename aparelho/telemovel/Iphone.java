package aparelho.telemovel;

import aparelho.mul.multimidia;
import aparelho.net.internet;
import aparelho.pho.phone;

public class Iphone implements multimidia, internet, phone {

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

    @Override
    public void ligar() {
        System.out.println("Chamando...");
    }

    @Override
    public void atender() {
        System.out.println(" Bom dia! Lucas Almeida desenvolvedor Back End, como posso te ajudar ? ");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Tum.. Tum.. Tum.. Deixe seu recado após o sinal... PIIIII");
    }
}

