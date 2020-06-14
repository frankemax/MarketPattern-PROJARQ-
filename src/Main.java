public class Main {

    public static void main(String[] args) {
        Carrinho car = Carrinho.getInstance();
        System.out.println("car vazio: " + car.toString());

        Controller  c1 = new Controller();
        c1.addAtualizaCarrinhoObserver(car);

        car.PopulaCarrinho();
        c1.start();

        System.out.println(car.toString());



    }
}
