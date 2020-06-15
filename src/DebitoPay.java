import java.util.Scanner;

public class DebitoPay implements Pagamento{
    @Override
    public void processaPagamento(double valor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O valor da sua compra é de: " + valor);

        System.out.println("Insira seu numero do cartão de debito");
        sc.next();
        System.out.println("Insira seu CPF");
        sc.next();
        System.out.println("Insira os 4 ultimos digitos do verso do seu cartao");
        sc.next();

        System.out.println("Pagamento concluido");

        System.out.println("Obrigado pela preferencia.");

    }
}
