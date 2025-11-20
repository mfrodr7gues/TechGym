package classes;

import java.util.ArrayList;

// Classe filha
public class Instrutor extends Usuario {

    // Atributos
    private int idInstrutor;

    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Aluno aluno;

    // Construtor
    public Instrutor (String nome, String email, String senha, int idInstrutor, Aluno aluno) {

        // Atributos herdados da classe mãe
        super (nome, email, senha);

        this.idInstrutor = idInstrutor;
        this.aluno = aluno;
    }

    // Acesso às privates usando getters e setters
    public int getIdInstrutor() {
        return idInstrutor;
    }

    public void setIdInstrutor (int idInstrutor) {
        this.idInstrutor = idInstrutor;
    }

    public Aluno getAluno() {
        return aluno;
    }  

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    // Métodos específicos da classe Instrutor
    public void liberarAcesso (Aluno aluno) {
        System.out.println("Acesso liberado para o aluno " + aluno.getNome());
    }

    public void suspenderAcesso(Aluno aluno) {
        System.out.println("Acesso suspenso para o aluno " + aluno.getNome());
    }

    public void reatarAcesso(Aluno aluno) {
        System.out.println("Acesso reativado para o aluno " + aluno.getNome());
    }

    public void listarAlunos {
        System.out.println("ai");
    }

    public void cancelarMatricula () {
        System.out.println("Matrícula do aluno " + getNome() + " foi cancelada.");
    }

    public void procurarAluno (String nome) {
        System.out.println("Procurando aluno: " + getNome());
    }

    // Métodos abstratos implementados da classe mãe
    @Override
    public void realizarLogin(String email, String senha) {

        if (getEmail().equals(email) && getSenha().equals(senha)) {
            System.out.println ("Olá, " + getNome() + "! Login realizado com sucesso.");
        }
        
        else {
            System.out.println ("Ops... Email ou senha incorretos! Tente novamente.");
        }
    }

    @Override
    public void realizarLogout() {
        System.out.println ("O usuário " + getNome() + " realizou logout.");
    }

    @Override
    public void criarFichaDeTreino() {
        System.out.println ("Instrutor " + getNome() + " está criando uma ficha.");
    }

    @Override
    public void editarFichaDeTreino() {
        System.out.println ("Instrutor " + getNome() + " está editando uma ficha.");
    }

    @Override
    public void salvarFichaDeTreino() {
        System.out.println ("Instrutor " + getNome() + " salvou a ficha.");
    }

    @Override
    public void acessarFichaDeTreino() {
        System.out.println ("Instrutor " + getNome() + " acessou ficha de treino.");
    }

    @Override
    public void criarAvaliacaoFisica() {
        System.out.println ("Instrutor " + getNome() + " está criando avaliação física.");
    }

    @Override
    public void editarAvaliacaoFisica() {
        System.out.println ("Instrutor " + getNome() + " está editando avaliação física.");
    }

    @Override
    public void salvarAvaliacaoFisica() {
        System.out.println ("Instrutor " + getNome() + " salvou avaliação física.");
    }

    @Override
    public void acessarAvaliacaoFisica() {
        System.out.println ("Instrutor " + getNome() + " acessou avaliação física.");
    }
}