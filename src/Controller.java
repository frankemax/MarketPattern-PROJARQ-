import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Controller extends Thread{
    private List<AtualizaCarrinhoObserver> observers = new ArrayList<AtualizaCarrinhoObserver>();

    public void addAtualizaCarrinhoObserver(AtualizaCarrinhoObserver observer){
        this.observers.add(observer);
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1- Adicionar novo produto | 2- Finalizar Compra | 3- Produtos Disponiveis | 4- Produtos no carrinho");
            int valor = scanner.nextInt();

            if(valor ==1){
                System.out.println("Nome do produto");
                String nome = scanner.next();

                Carrinho.getInstance().addProduto(nome,1);


                AtualizaCarrinhoEvent event = new AtualizaCarrinhoEvent(new Date());

                for(AtualizaCarrinhoObserver observer : this.observers){
                    observer.chegou(event);
                }
            }else if (valor ==3) {
                Carrinho.getInstance().mostraProdutos();
            }
            else if (valor ==4) {
                Carrinho.getInstance().mostraCarrinho();


            }else{
                System.out.println("codigo invalido");
            }

        }
    }



}
