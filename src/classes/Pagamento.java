package classes;
import java.util.Date;

public class Pagamento {
    private int idPagamento;
    private Date dataPagamento;
    private float valorPagamento;
    private String metodoPagamento;
    private boolean statusPagamento;
    private int idMatricula;

    public Pagamento(int idPagamento, Date dataPagamento, float valorPagamento, String metodoPagamento, boolean statusPagamento, int idMatricula) {
        this.idPagamento = idPagamento;
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
        this.idMatricula = idMatricula;
    }

    public void registrarStatus(boolean status) {
        this.statusPagamento = status;
    }

    public boolean verificarStatus() {
        return this.statusPagamento;
    }

    public boolean atualizarStatus(boolean novoStatus) {
        if (this.statusPagamento == novoStatus) {
            return false;
        }
        this.statusPagamento = novoStatus;
        return true;
    }
}
