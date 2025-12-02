import java.util.Date;

public class Pagamento {

    // Atributos
    private int idPagamento;
    private Date dataPagamento;
    private double valorPagamento;
    private String metodoPagamento;
    private boolean statusPagamento;
    private Matricula matricula; // O que isso significa?

    // Construtor
    public Pagamento (int idPagamento, Date dataPagamento, double valorPagamento, String metodoPagamento, boolean statusPagamento, Matricula matricula) {
        
        this.idPagamento = idPagamento;
        this.dataPagamento = new Date(); // O que isso significa?
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = false; // Por que isso está como 'false'?
        this.matricula = matricula;
    }

    // Esse tando de get e set é realmente necessário?
    // Acesso às privates usando getters e setters
    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento (int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento (Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento (double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento (String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public boolean isStatusPagamento() { // Por que aqui se usa esse 'IS'?
        return statusPagamento;
    }

    public Matricula getMatricula() { // Precisa de set?
        return matricula;
    }

    public void detalhesPagamento() {

        // Será que tem como transformar isso tudo em um dicionário/objeto?
        System.out.println("DETALHES DE PAGAMENTO: \n");
        System.out.println("ID: " + idPagamento);
        System.out.println("Data: " + new Date());
        System.out.println("Valor: R$" + valorPagamento);
        System.out.println("Método: " + metodoPagamento);
    }
    

    public void registrarPagamento() {

        if (valorPagamento >= matricula.getPlano().getValorPlano()) {
            this.statusPagamento = true;
            matricula.setPaga(true);
            System.out.println("Pagamento registrado: R$ " + valorPagamento);
        }
        
        else {
            System.out.println("Ops... pagamento recusado! Valor insuficiente.");
        }
    }
    
    public void verificarStatus() {

        System.out.println("Status de pagamento: " + (statusPagamento ? "Pago" : "Pendente")); 
    }

}