package classes;

import java.util.Date;

public class AvaliacaoFisica {

    // Atributos
    private int idAvaliacaoFisica;
    private Date dataAvaliacaoFisica;
    private double peso;
    private double altura;
    private double imc;

    // Construtor
    public AvaliacaoFisica (int idAvaliacaoFisica, Date dataAvaliacaoFisica, double peso, double altura) {

        this.idAvaliacaoFisica = (int) (Math.random() * 1000) + 2000;
        this.dataAvaliacaoFisica = new Date();
        this.peso = peso;
        this.altura = altura;
        this.imc = peso / (altura * altura);
    }

    // Acesso às privates usando getters e setters
    public int getIdAvaliacaoFisica() {
        return idAvaliacaoFisica;
    }

    public void setIdAvaliacaoFisica (int idAvaliacaoFisica) {
        this.idAvaliacaoFisica = idAvaliacaoFisica;
    }

    public Date getDataAvaliacaoFisica() {
        return dataAvaliacaoFisica;
    }

    public void setDataAvaliacaoFisica (Date dataAvaliacaoFisica) {
        this.dataAvaliacaoFisica = dataAvaliacaoFisica;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso (double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }

    public double getIMC() {
        return imc;
    }

    public void setIMC (double imc) {
        this.imc = imc;
    }

    // Métodos específicos da classe AvaliacaoFisica
    public void criarAvaliacaoFisica() {

        System.out.println("Avaliação física criada: " + idAvaliacaoFisica);
    }

    public void editarAvaliacaoFisica (double novoPeso, double novaAltura, double imc) {

        this.peso = novoPeso;
        this.altura = novaAltura;
        this.imc = peso / (altura * altura);
        System.out.println("Avaliação física editada");
    }

    public void salvarAvaliacaoFisica() {

        System.out.println("Avaliação física salva!");
    }

    public void acessarAvaliacaoFisica() {

        System.out.println("Código: " + idAvaliacaoFisica);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Altura: " + altura + "m");
        System.out.println("IMC: " + String.format("%.2f", imc)); // ???
    }
}