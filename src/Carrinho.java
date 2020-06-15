import java.util.ArrayList;

public class Carrinho implements AtualizaCarrinhoObserver{
    private ArrayList <Produto> lista;
    private ArrayList <Produto> listaTotal;
    private static Carrinho instance;

    private Carrinho() {

    }

    public static Carrinho getInstance(){
        if (instance == null){
            instance = new Carrinho();
        }
        return instance;
    }

    public void PopulaCarrinho(){
        ArrayList<Produto> a = new ArrayList<Produto>();
        ArrayList<Produto> b = new ArrayList<Produto>();

        Produto p1 = new Produto(1.0,"Batata");
        Produto p2 = new Produto(2.0,"Feijao");
        Produto p3 = new Produto(3.0,"Maça");
        Produto p4 = new Produto(1.0,"Repolho");
        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);

        this.listaTotal= a;
        this.lista = b;
    }
    public void mostraCarrinho(){
        System.out.println("Produtos no carrinho: ");
        for (Produto a : this.lista){
            System.out.print(a.toString() +" ");
        }
    }

    public void addProduto(double preco,String nome){
        this.lista.add(new Produto (preco,nome));
    }

    public void mostraProdutos(){
        System.out.println("produtos disponiveis:");
        for (Produto a: this.listaTotal){
            System.out.print(a.toString() +" ");
        }
    }

    public void finalizaCompra(){

        FactoryPagamento f1= new FactoryPagamento();
        f1.valor=calculaPreco(this.lista);
        f1.escolhePagamento();

        this.lista= new ArrayList<Produto>();

    }

    public double calculaPreco(ArrayList<Produto> listaCompras) {
        double precoTotal = 0;
        for(Produto a : listaCompras){
            precoTotal= a.getPreco() + precoTotal;
        }
        return precoTotal;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "lista=" + lista +
                '}';
    }

    @Override
    public void chegou(AtualizaCarrinhoEvent event) {
        System.out.println("o carrinho foi atualizado as " + event.getHoraDaAtualizacao());

    }
}
