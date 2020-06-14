import java.util.ArrayList;

public class Carrinho {
    private ArrayList <Produto> lista;
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
        Produto p2 = new Produto(2.0,"Feijao",10);
        Produto p3 = new Produto(3.0,"Maça",1);
        a.add(p1);
        a.add(p2);
        a.add(p3);

        this.lista= a;
    }

    public void LimpaCarrinho(){
        instance = null;
    }

    public void addProduto(String nome, int quantidade){
        this.lista.add(new Produto (1,nome, quantidade));


    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "lista=" + lista +
                '}';
    }
}
