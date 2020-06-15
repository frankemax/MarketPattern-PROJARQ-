import java.util.ArrayList;

public class BoletoPay implements Pagamento{
    @Override
    public void processaPagamento(double valor) {
        System.out.println("O valor da sua compra é de: " + valor);

        System.out.println("O boleto contem o seguinte código de barras: 1231231231566854194861564135246185684715154");

        System.out.println("Obrigado pela preferencia.");


    }





}
