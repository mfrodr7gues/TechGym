package classes;

// Classe mãe
public abstract class Usuario {
    
    // Atributos
    private String nome;
    private String email;
    private String senha;

    // Construtor
    public Usuario (String nome, String email, String senha) {

        this.nome = nome;
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

    // Métodos abstratos da classe mãe
    public abstract void realizarLogin (String email, String senha);

    public abstract void realizarLogout();

    public abstract void cancelarMatricula();

    public abstract void criarFichaDeTreino();

    public abstract void editarFichaDeTreino();

    public abstract void salvarFichaDeTreino();

    public abstract void acessarFichaDeTreino();

    public abstract void criarAvaliacaoFisica();

    public abstract void editarAvaliacaoFisica();

    public abstract void salvarAvaliacaoFisica();

    public abstract void acessarAvaliacaoFisica();
}