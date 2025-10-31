package classes;

// Classe mãe
public class Usuario {
    
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    // Construtor
    public Usuario (String nome, String sobrenome, String email, String senha) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
    }

    // Acesso às privates usando getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome (String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha (String senha) {
        this.senha = senha;
    }
}