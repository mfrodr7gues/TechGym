package classes;

import java.util.Date;

public class Matricula {

    // Atributos
    private int idMatricula;
    private Date dataInicio;
    private Date dataFim;
    private boolean statusMatricula;

    private Aluno aluno;
    private Plano plano;
    private Pagamento tipoPagamento;

    // Construtor
    public Matricula (int idMatricula, Date dataInicio, Date dataFim, boolean statusMatricula, Aluno aluno, Plano plano, Pagamento tipoPagamento) {
        
        this.idMatricula = idMatricula;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.statusMatricula = statusMatricula;
        this.aluno = aluno;
        this.plano = plano;
        this.tipoPagamento = tipoPagamento;
    }

    // Acesso às privates usando getters e setters
    public int getIdMatricula() {
        return idMatricula;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio (Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim (Date dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula (boolean statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    // Métodos específicos da classe Matricula
    private Date addMonths(Date date, int months) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(date != null ? date : new Date());
        cal.add(java.util.Calendar.MONTH, months);
        return cal.getTime();
    }
    
    public void realizarMatricula() {
        this.dataInicio = new Date();
        this.dataFim = addMonths(this.dataInicio, 1);
        this.statusMatricula = true;
    }
    
    public void cancelarMatricula() {
        this.statusMatricula = false;
        this.dataFim = new Date();
    }
    
    public void renovarMatricula() {
        if (!this.statusMatricula) {
            realizarMatricula();
            return;
        }
        this.dataFim = addMonths(this.dataFim, 1);
        this.statusMatricula = true;
    }
}