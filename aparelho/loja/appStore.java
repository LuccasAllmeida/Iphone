package aparelho.loja;

import aparelho.mul.multimidia;
import aparelho.net.internet;
import aparelho.pho.phone;
import aparelho.telemovel.Iphone;

public class appStore {
    public static void main (String[] args){
        Iphone iphone13 = new Iphone();
        multimidia multimida = iphone13;
        internet internet = iphone13;
        phone phone = iphone13;

        iphone13.atender();

    }
}
