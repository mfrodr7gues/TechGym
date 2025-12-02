public class Plano {

    // Atributos
    private int idPlano;
    private String nomePlano;
    private String descricaoPlano;
    private double valorPlano;
    private int duracaoMeses;

    // Construtor
    public Plano (int idPlano, String nomePlano, String descricaoPlano, double valorPlano, int duracaoMeses) {

        this.idPlano = idPlano;
        this.nomePlano = nomePlano;
        this.descricaoPlano = descricaoPlano;
        this.valorPlano = valorPlano;
        this.duracaoMeses = duracaoMeses;
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

    public String getDescricaoPlano() {
        return descricaoPlano;
    }

    public void setDescricaoPlano (String descricaoPlano) {
        this.descricaoPlano = descricaoPlano;
    }

    public double getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano (double valorPlano) {
        this.valorPlano = valorPlano;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses (int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    // Métodos específicos da classe Plano
    public void selecionarPlano() {

        System.out.println("Plano selecionado: " + nomePlano);
    }
    
    public void visualizarPlano() {

        System.out.println("PLANO: \n");
        System.out.println("Nome: " + nomePlano);
        System.out.println("Descrição: " + descricaoPlano);
        System.out.println("Valor: R$ " + valorPlano + "/mês");
        System.out.println("Duração: " + duracaoMeses + " meses");
    }

    // Cadê o método 'atualizarPlano'?

}