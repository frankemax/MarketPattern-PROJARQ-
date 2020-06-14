import java.util.Date;

public class AtualizaCarrinhoEvent {
    private final Date horaDaChegada;

    public AtualizaCarrinhoEvent(Date horaDaChegada){
        super();
        this.horaDaChegada = horaDaChegada;
    }

    public Date getHoraDaChegada() {
        return horaDaChegada;
    }
}
