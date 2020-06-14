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

        Produto p1 = new Produto(1.0,"Batata",1);
        Produto p2 = new Produto(2.0,"Feijao",1);
        Produto p3 = new Produto(3.0,"Maça",1);
        Produto p4 = new Produto(1.0,"Repolho",1);
        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);

        this.listaTotal= a;
    }

    public void LimpaCarrinho(){
        instance = null;
    }

    public void addProduto(String nome, int quantidade){
        this.lista.add(new Produto (1,nome, quantidade));
    }

    public void mostraProdutos(){
        System.out.println("produtos disponiveis:");
        for (Produto a: this.listaTotal){
            System.out.print(a.toString() +" ");
        }
    }

    public void mostraCarrinho(){
        System.out.println("Produtos no carrinho");
        for (Produto a : this.lista){
            System.out.print(a.toString() +" ");
        }
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "lista=" + lista +
                '}';
    }

    @Override
    public void chegou(AtualizaCarrinhoEvent event) {
        System.out.println("o carrinho foi atualizado");
    }
}
