package classes;
import java.util.Date;

public class Matricula {
    private int idMatricula;
    private Date dataInicio;
    private Date dataFim;
    private boolean statusMatricula;

    private Aluno aluno;
    private Plano plano;
    private Pagamento tipoPagamento;

    public Matricula(int idMatricula, Date dataInicio, Date dataFim, boolean statusMatricula, Aluno aluno, Plano plano, Pagamento tipoPagamento) {
        
    this.idMatricula = idMatricula;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
    this.statusMatricula = statusMatricula;
    this.aluno = aluno;
    this.plano = plano;
    this.pagamento = pagamento;
}


}
