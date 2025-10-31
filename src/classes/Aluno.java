package classes;

// Classe filha
public class Aluno extends Usuario {
    
    // Atributos
    private int idAluno;
    private String cpfAluno;
    private int dataNascimentoAluno;
    private char sexoAluno;
    private int telefoneAluno;

    // Construtor
    public Aluno (String nome, String sobrenome, String email, String senha, int idAluno, String cpfAluno,int dataNascimentoAluno, char sexoAluno, int telefoneAluno) {
        
        // Atributos herdados da classe mãe
        super (nome, sobrenome, email, senha);

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

    public void setCpfAluno (String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public int getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }

    public void setDataNascimentoAluno (int dataNascimentoAluno) {
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
}