package aparelho.pho;

public class aparelhoTelefonico implements phone{
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
