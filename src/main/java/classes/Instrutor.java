package classes;

import java.util.ArrayList;
import java.util.List;

// Classe filha
public class Instrutor extends Usuario {

    // Atributos
    private int idInstrutor;
    private List<Aluno> alunos;
    private Matricula matricula;

    // Construtor
    public Instrutor (String nome, String email, String senha, int idInstrutor) {

        // Atributos herdados da classe mãe
        super (nome, email, senha);

        this.idInstrutor = idInstrutor;
        this.alunos = new ArrayList<>();
    }

    // Acesso às privates usando getters e setters
    public int getIdInstrutor() { 
        return idInstrutor; 
    }

    public List<Aluno> getAlunos() { 
        return alunos; 
    }

    public void setMatricula (Matricula matricula) { 
        this.matricula = matricula; 
    }

    // Métodos abstratos implementados pela classe mãe
    @Override
    public void realizarLogin (String email, String senha) {

        if (getEmail().equals(email) && getSenha().equals(senha)) {

            setLogado(true);
            System.out.println("Instrutor logado: " + getNome());
        }

        else {

            System.out.println("Login falhou");
        }
    }

    @Override
    public void realizarLogout() {

        setLogado(false);
        System.out.println("Instrutor logout: " + getNome());
    }

    @Override
    public void cancelarMatricula() {

        if (matricula != null) {

            matricula.cancelarMatricula();
            System.out.println("Matrícula cancelada: " + getNome());
        }
    }

    // Métodos específicos da classe Instrutor
    public void liberarAcesso (Aluno aluno) {

        if (aluno.getMatricula() != null && aluno.getMatricula().isPaga()) {

            System.out.println("Acesso liberado para " + aluno.getNome());
        }
        
        else {

            System.out.println("Acesso negado. Pagamento pendente!");
        }
    }

    public void reativarAcesso (Aluno aluno) {

        if (aluno.getMatricula() != null) {

            aluno.getMatricula().renovarMatricula();
            System.out.println("Acesso reativado para " + aluno.getNome());
        }
    }

    public Aluno procurarAluno (String nome) {

        for (Aluno aluno : alunos) {

            if (aluno.getNome().equalsIgnoreCase(nome)) {

                return aluno;
            }
        }

        return null;
    }

    public void visualizarAluno (Aluno aluno) {

        if (aluno != null) {

            System.out.println("DADOS DO ALUNO: \n");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("Matrícula ativa: " + (aluno.getMatricula() != null && aluno.getMatricula().isAtiva()));
            System.out.println("Pagamento em dia: " + (aluno.getMatricula() != null && aluno.getMatricula().isPaga()));
        }
    }

    public void adicionarAluno (Aluno aluno) {

        if (!alunos.contains(aluno)) {

            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado ao instrutor!");
        }
    }
}