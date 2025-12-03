package classes;

import java.util.Date;

public class FichaTreino {

    // Atributos
    private int idFichaTreino;
    private Date dataCriacao;
    private String[] exercicios;
    private String[] seriesRepeticoes;
    
    // Construtor
    public FichaTreino(String[] exercicios, String[] seriesRepeticoes) {
        this.idFichaTreino = (int) (Math.random() * 1000) + 3000;
        this.dataCriacao = new Date();
        this.exercicios = exercicios;
        this.seriesRepeticoes = seriesRepeticoes;
    }
    
    // Acesso às privates usando getters e setters
    
    // Escrever aqui!

    // Getters
    public int getIdFichaTreino() { return idFichaTreino; }
    public Date getDataCriacao() { return dataCriacao; }
    public String[] getExercicios() { return exercicios; }
    public String[] getSeriesRepeticoes() { return seriesRepeticoes; }

    // Métodos específicos da classe Instrutor
    public void criarFichaTreino() {
        System.out.println("Ficha de treino criada: " + idFichaTreino);
    }

    public void editarFichaTreino(String[] novosExercicios, String[] novasSeries) {
        this.exercicios = novosExercicios;
        this.seriesRepeticoes = novasSeries;
        System.out.println("Ficha de treino editada!");
    }

    public void salvarFichaTreino() {
        System.out.println("Ficha de treino salva!");
    }

    public void acessarFichaTreino() {
        System.out.println("ID da ficha: " + idFichaTreino);
        for (int i = 0; i < exercicios.length; i++) {
            System.out.println((i+1) + ". " + exercicios[i] + " - " + seriesRepeticoes[i]);
        }
    }
}