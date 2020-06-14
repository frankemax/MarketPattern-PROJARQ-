public class Main {

    public static void main(String[] args) {
        Carrinho car = Carrinho.getInstance();
        System.out.println("car vazio: " + car.toString());

        Carrinho.getInstance().populaProdutos();
        Carrinho.getInstance().addProduto("Batata");



    }
}
