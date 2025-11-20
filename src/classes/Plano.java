package classes;

public class Plano {

    // Atributos
    private int idPlano;
    private String nomePlano;
    private float duracaoPlano; 
    private float valorPlano;

    // Construtor
    public Plano (int idPlano, String nomePlano, float duracaoPlano, float valorPlano) {

        this.idPlano = idPlano;
        this.nomePlano = nomePlano;
        this.duracaoPlano = duracaoPlano;
        this.valorPlano = valorPlano;
    }

    // Acesso às privates usando getters e setters
    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano (int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano (String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public float getDuracaoPlano() {
        return duracaoPlano;
    }

    public void setDuracaoPlano (float duracaoPlano) {
        this.duracaoPlano = duracaoPlano;
    }

    public float getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano (float valorPlano) {
        this.valorPlano = valorPlano;
    }

    // Métodos especificos da classe Plano
    public void selecionarPlano() {
        System.out.println ("Plano " + nomePlano + " selecionado.");
    }

    public String visualizarPlano() {
        return "Plano ID: " + idPlano + "\n" + "Nome do Plano: " + nomePlano + "\n" + "Duração (meses): " + duracaoPlano + "\n" + "Valor (R$): " + valorPlano;
    }

    public void atualizarPlano (String nomePlano, float duracaoPlano, float valorPlano) {
        this.nomePlano = nomePlano;
        this.duracaoPlano = duracaoPlano;
        this.valorPlano = valorPlano;
        System.out.println ("Plano atualizado com sucesso.");
    }
}