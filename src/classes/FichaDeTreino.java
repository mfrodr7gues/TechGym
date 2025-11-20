<<<<<<< HEAD
package classes;

import java.util.Date;

public class FichaDeTreino {
    
    // Atributos
    private int idFichaDeTreino;
    private Date dataCriacao;
    private String objetivo;
    private String[] exercicios;
    private String[] seriesRepeticoes;
    private String detalhes;

    // Construtor
    public FichaDeTreino (int idFichaDeTreino, Date dataCriacao, String objetivo, String[] exercicios, String[] seriesRepeticoes, String detalhes) {
        this.idFichaDeTreino = idFichaDeTreino;
        this.dataCriacao = dataCriacao;
        this.objetivo = objetivo;
        this.exercicios = exercicios;
        this.seriesRepeticoes = seriesRepeticoes;
        this.detalhes = detalhes;
    }

    // Acesso às privates usando getters e setters
    public int getIdFichaDeTreino() {
        return idFichaDeTreino;
    }

    public void setIdFichaDeTreino (int idFichaDeTreino) {
        this.idFichaDeTreino = idFichaDeTreino;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao (Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo (String objetivo) {
        this.objetivo = objetivo;
    }

    public String[] getExercicios() {
        return exercicios;
    }

    public void setExercicios (String[] exercicios) {
        this.exercicios = exercicios;
    }

    public String[] getSeriesRepeticoes() {
        return seriesRepeticoes;
    }

    public void setSeriesRepeticoes (String[] seriesRepeticoes) {
        this.seriesRepeticoes = seriesRepeticoes;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes (String detalhes) {
        this.detalhes = detalhes;
    }
}
=======
package classes;

import java.util.Date;

public class FichaDeTreino {
    
    // Atributos
    private int idFichaDeTreino;
    private Date dataCriacao;
    private String objetivo;
    private String[] exercicios;
    private String[] seriesRepeticoes;
    private String detalhes;

    // Construtor
    public FichaDeTreino (int idFichaDeTreino, Date dataCriacao, String objetivo, String[] exercicios, String[] seriesRepeticoes, String detalhes) {
        this.idFichaDeTreino = idFichaDeTreino;
        this.dataCriacao = dataCriacao;
        this.objetivo = objetivo;
        this.exercicios = exercicios;
        this.seriesRepeticoes = seriesRepeticoes;
        this.detalhes = detalhes;
    }

    // Acesso às privates usando getters e setters
    public int getIdFichaDeTreino() {
        return idFichaDeTreino;
    }

    public void setIdFichaDeTreino (int idFichaDeTreino) {
        this.idFichaDeTreino = idFichaDeTreino;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao (Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo (String objetivo) {
        this.objetivo = objetivo;
    }

    public String[] getExercicios() {
        return exercicios;
    }

    public void setExercicios (String[] exercicios) {
        this.exercicios = exercicios;
    }

    public String[] getSeriesRepeticoes() {
        return seriesRepeticoes;
    }

    public void setSeriesRepeticoes (String[] seriesRepeticoes) {
        this.seriesRepeticoes = seriesRepeticoes;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes (String detalhes) {
        this.detalhes = detalhes;
    }
}
>>>>>>> 40687a5c3de2e7dce1886452485cc04e58edc75c
