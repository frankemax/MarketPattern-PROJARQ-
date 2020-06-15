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
        Carrinho.getInstance().PopulaCarrinho();

        while(true){
            System.out.println("\n");
            System.out.println("1- Adicionar novo produto | 2- Finalizar Compra | 3- Produtos Disponiveis | 4- Produtos no carrinho");
            int valor = scanner.nextInt();

            if(valor ==1){
                System.out.println("Nome do produto");
                String nome = scanner.next();

                System.out.println("Preco do produto");
                double preco = scanner.nextDouble();

                Carrinho.getInstance().addProduto(preco,nome);


                AtualizaCarrinhoEvent event = new AtualizaCarrinhoEvent(new Date());

                for(AtualizaCarrinhoObserver observer : this.observers){
                    observer.chegou(event);
                }

            }else if(valor ==2){
                Carrinho.getInstance().finalizaCompra();

            }
            else if (valor ==3) {
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
