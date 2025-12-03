package classes;

import java.util.Date;

// Essa classe tá bem bagunçada, tem que ajeitar!!!
// Isso que eu vim fazer.

public class Matricula {

    // Atributos
    private int idMatricula;
    private Date dataInicio;
    private Date dataFim;
    private boolean ativa;
    private boolean paga;
    private Aluno aluno;
    private Plano plano;
    private Pagamento pagamento;
    private double randomizer = Math.random() * 1000 + 18.11;

    // Construtor
    public Matricula(Aluno aluno, Plano plano) {
        this.idMatricula = (int) randomizer;
        this.dataInicio = new Date();
        this.ativa = true;
        this.paga = false;
        this.aluno = aluno;
        this.plano = plano;
    }

    public void realizarMatricula() {
        System.out.println("Matrícula realizada: " + idMatricula + " para " + aluno.getNome());
    }

    public void cancelarMatricula() {
        this.ativa = false;
        this.dataFim = new Date();
        System.out.println("Matrícula cancelada: " + aluno.getNome());
    }

    public void renovarMatricula() {
        this.ativa = true;
        this.dataFim = null;
        this.paga = false;
        System.out.println("Matrícula renovada: " + aluno.getNome());
    }

    // Por que o realizar pagamento está aqui se não é um método da classe Matricula?
    public void realizarPagamento(double valor, String metodo) {

        // Meu Deus, que bagunça é essa aqui em baixo?
        // Era só alinhar os parâmetros do construtor com os atributos da classe Pagamento.
        this.pagamento = new Pagamento((int) randomizer, new Date(), valor, metodo, false, this);
        pagamento.registrarPagamento();
    }

    // Getters e Setters
    public int getIdMatricula() { return idMatricula; }
    public Date getDataInicio() { return dataInicio; }
    public Date getDataFim() { return dataFim; }
    public boolean isAtiva() { return ativa; }
    public boolean isPaga() { return paga; }
    public void setPaga(boolean paga) { this.paga = paga; }
    public Aluno getAluno() { return aluno; }
    public Plano getPlano() { return plano; }
    public Pagamento getPagamento() { return pagamento; }
}

