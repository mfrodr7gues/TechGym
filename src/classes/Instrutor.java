package classes;

// Classe filha
public class Instrutor extends Usuario {

    // Atributos
    private int idInstrutor;

    // Construtor
    public Instrutor (String nome, String email, String senha, int idInstrutor) {

        // Atributos herdados da classe mãe
        super (nome, email, senha);

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