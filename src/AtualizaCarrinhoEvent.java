import java.util.Date;

public class AtualizaCarrinhoEvent {
    private final Date horaDaAtualizacao;

    public AtualizaCarrinhoEvent(Date horaDaAtualizacao){
        super();
        this.horaDaAtualizacao = horaDaAtualizacao;
    }

    public Date getHoraDaAtualizacao() {
        return horaDaAtualizacao;
    }
}
