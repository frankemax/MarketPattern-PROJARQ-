public class Main {

    public static void main(String[] args) {
        Controller  c1 = new Controller();
        c1.addAtualizaCarrinhoObserver(Carrinho.getInstance());
        c1.start();




    }
}
