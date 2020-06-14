import java.util.ArrayList;

public class Carrinho {
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

    public void populaProdutos(){
        ArrayList<Produto> a = new ArrayList<Produto>();
        ArrayList<Produto> b = new ArrayList<Produto>();

        Produto p1 = new Produto("Batata");
        Produto p2 = new Produto("Feijao");
        Produto p3 = new Produto("Maca");
        Produto p4 = new Produto("Repolho");
        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);

        this.listaTotal= a;
        this.lista=b;
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

    public void LimpaCarrinho(){
        instance = null;
    }

    public void addProduto(String nome){
        this.lista.add(new Produto (nome));

    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "lista=" + lista +
                '}';
    }
}
