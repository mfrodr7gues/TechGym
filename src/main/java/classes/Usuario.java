package classes;

import java.util.ArrayList;
import java.util.List;

// Classe mãe
public abstract class Usuario {

    // Atributos
    private String nome;
    private String email;
    private String senha;
    private boolean logado;
    private List<FichaTreino> fichasTreino;
    private List<AvaliacaoFisica> avaliacoes;

    // Construtor
    public Usuario (String nome, String email, String senha) {

        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.logado = false; 
        this.fichasTreino = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    // Acesso às privates usando getters e setters
    public String getNome() {
        return nome; 
    }

    public String getEmail() { 
        return email; 
    }

    public String getSenha() { 
        return senha; 
    }

    public boolean isLogado() { 
        return logado; 
    }

    public List<FichaTreino> getFichasTreino() { 
        return fichasTreino; 
    }

    public List<AvaliacaoFisica> getAvaliacoes() { 
        return avaliacoes; 
    }

    protected void setLogado (boolean logado) { 
        this.logado = logado;
    }

    // Métodos abstratos da classe mãe
    public abstract void realizarLogin (String email, String senha);
    public abstract void realizarLogout();
    public abstract void cancelarMatricula();
}