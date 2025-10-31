package classes;

// Classe filha
public class Instrutor extends Usuario {

    // Atributos
    private int idInstrutor;

    // Construtor
    public Instrutor (String nome, String sobrenome, String email, String senha, int idInstrutor) {

        // Atributos herdados da classe mãe
        super (nome, sobrenome, email, senha);

        this.idInstrutor = idInstrutor;
    }

    // Acesso às privates usando getters e setters
    public int getIdInstrutor() {
        return idInstrutor;
    }

    public void setIdInstrutor (int idInstrutor) {
        this.idInstrutor = idInstrutor;
    }
}