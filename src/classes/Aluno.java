package classes;

import java.util.Date;
import java.util.List;

// Classe filha
public class Aluno extends Usuario {
    
    // Atributos
    private int idAluno;
    private String cpfAluno;
    private Date dataNascimentoAluno;
    private char sexoAluno;
    private int telefoneAluno;

    // Construtor
    public Aluno (String nome, String email, String senha, int idAluno, String cpfAluno, Date dataNascimentoAluno, char sexoAluno, int telefoneAluno) {
        
        // Atributos herdados da classe mãe
        super (nome, email, senha);

        this.idAluno = idAluno;
        this.cpfAluno = cpfAluno;
        this.dataNascimentoAluno = dataNascimentoAluno;
        this.sexoAluno = sexoAluno;
        this.telefoneAluno = telefoneAluno;
    }

    // Acesso às privates usando getters e setters
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno (int idAluno) {
        this.idAluno = idAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public Date getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }

    public void setDataNascimentoAluno (Date dataNascimentoAluno) {
        this.dataNascimentoAluno = dataNascimentoAluno;
    }

    public char getSexoAluno() {
        return sexoAluno;
    }

    public void setSexoAluno (char sexoAluno) {
        this.sexoAluno = sexoAluno;
    }

    public int getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno (int telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
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
    public void cancelarMatricula() {
        System.out.println ("O aluno " + getNome() + " cancelou a matrícula.");
    }
}