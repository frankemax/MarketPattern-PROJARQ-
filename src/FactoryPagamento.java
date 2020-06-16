import java.util.ArrayList;
import java.util.Scanner;

public class FactoryPagamento {
    public double valor;


    public void escolhePagamento(){
        System.out.println("Qual o método de pagamento? ");
        System.out.println("1- Boleto | 2- PayPal | 3- Debito | 4- Credito");
        Scanner scanner = new Scanner(System.in);

        int opcao=scanner.nextInt();


        switch (opcao){
            case 1:
                BoletoPay b1 =  new BoletoPay();
                b1.processaPagamento(valor);
                break;
            case 2:
                PaypalPay p1 =  new PaypalPay();
                p1.processaPagamento(valor);
                break;
            case 3:
                DebitoPay d1 =  new DebitoPay();
                d1.processaPagamento(valor);
                break;
            case 4:
                CreditoPay c1 =  new CreditoPay();
                c1.processaPagamento(valor);
                break;
        }


    }

}
