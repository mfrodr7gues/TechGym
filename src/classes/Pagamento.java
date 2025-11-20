package classes;

import java.util.Date;

public class Pagamento {

    // Atributos
    private int idPagamento;
    private Date dataPagamento;
    private float valorPagamento;
    private String metodoPagamento;
    private boolean statusPagamento;
    private int idMatricula;

    // Construtor
    public Pagamento (int idPagamento, Date dataPagamento, float valorPagamento, String metodoPagamento, boolean statusPagamento, int idMatricula) {

        this.idPagamento = idPagamento;
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
        this.idMatricula = idMatricula;
    }

    // Acesso às privates usando getters e setters
    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    // Métodos específicos da classe Pagamento
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