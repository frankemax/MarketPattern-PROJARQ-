import java.util.Scanner;

public class PaypalPay implements Pagamento{
    @Override
    public void processaPagamento(double valor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O valor da sua compra é de: " + valor);

        System.out.println("Insira seu numero de telefone");
        sc.next();
        System.out.println("Insira sua senha");
        sc.next();



        System.out.println("Pagamento concluido");

        System.out.println("Obrigado pela preferencia.");


    }





}
