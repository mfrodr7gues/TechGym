package classes;

import java.util.Date;

// Classe filha
public class Aluno extends Usuario {

    // Atributos
    private int idAluno;
    private String cpf;
    private Date dataNascimento;
    private Matricula matricula;

    // Construtor
    public Aluno (String nome, String email, String senha, int idAluno, String cpf, Date dataNascimento) {
        
        // Atributos herdados da classe mãe 
        super (nome, email, senha);
        
        this.idAluno = idAluno;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    // Acesso às privates usando getters e setters
    public int getIdAluno() { 
        return idAluno; 
    }

    public String getCpf() { 
        return cpf; 
    }

    public Date getDataNascimento() { 
        return dataNascimento; 
    }
    
    public Matricula getMatricula() { 
        return matricula; 
    }
    
    // Métodos abstratos implementados pela classe mãe
    @Override
    public void realizarLogin (String email, String senha) {

        if (getEmail().equals(email) && getSenha().equals(senha)) {

            setLogado(true); // Alterando o atributo com set
            System.out.println("Login realizado: " + getNome());
        }
        
        else {

            System.out.println("Ops... Não foi possivel realizar login!");
        }
    }

    @Override
    public void realizarLogout() {

        setLogado(false);
        System.out.println("Logout: " + getNome());
    }

    @Override
    public void cancelarMatricula() {

        if (matricula != null) {

            matricula.cancelarMatricula();
            System.out.println("Matrícula cancelada: " + getNome());
        }
    }

    // Métodos específicos da classe Aluno
    public void realizarMatricula (Plano plano) {

        this.matricula = new Matricula(this, plano);
        matricula.realizarMatricula();
    }
    
    public void escolherPlano (Plano plano) {

        System.out.println("Plano escolhido: " + plano.getNomePlano());
    }
    
    public void realizarPagamento (double valor, String metodo) {

        if (matricula != null) {

            matricula.realizarPagamento(valor, metodo);
        }
        
        else {

            System.out.println("Matrícula não encontrada!");
        }
    }
}