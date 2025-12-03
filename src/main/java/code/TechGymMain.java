package code;

import classes.*;

import java.util.Calendar;
import java.util.Date;

public class TechGymMain {
    public static void main(String[] args) {
        System.out.println("SISTEMA TECHGYM : TESTE INICIANDO \n");

        // Criar planos
        Plano planoBasico = new Plano(1, "Básico", "Acesso apenas à musculação", 80.0, 1);
        Plano planoPremium = new Plano(2, "Premium", "Acesso completo", 120.0, 1);

        // Criar aluno
        Aluno aluno = new Aluno(
                "Otávio",
                "loez@email.com",
                "23022009",
                1,
                "000.000.000-00",
                new Date(2025, Calendar.AUGUST, 17)
        );

        // Criar instrutor
        Instrutor instrutor = new Instrutor(
                "Rodrigo Santana",
                "rodrigosantana@gmail.com",
                "instrutorRodrigo1",
                1
        );

        System.out.println("1. LOGIN:");
        aluno.realizarLogin("loez@email.com", "23022009");
        instrutor.realizarLogin("rodrigosantana@gmail.com", "instrutorRodrigo1");

        System.out.println("\n2. MATRÍCULA E PAGAMENTO:");
        aluno.realizarMatricula(planoPremium);
        aluno.realizarPagamento(120.0, "Cartão de crédito");

        System.out.println("\n3. INSTRUTOR GERENCIANDO ALUNO:");
        instrutor.adicionarAluno(aluno);
        instrutor.liberarAcesso(aluno);
        instrutor.visualizarAluno(aluno);

        System.out.println("\n4. FICHA DE TREINO:");
        String[] exercicios = {"Supino reto", "Agachamento livre", "Remada curvada", "Desenvolvimento lateral"};
        String[] series = {"4x10", "3x8", "3x12", "4x10"};
        FichaTreino ficha = new FichaTreino(exercicios, series);
        aluno.getFichasTreino().add(ficha);
        ficha.acessarFichaTreino();

        System.out.println("\n5. AVALIAÇÃO FÍSICA:");
        AvaliacaoFisica avaliacao = new AvaliacaoFisica(12, new Date(), 74.0, 1.80, 22.84);
        aluno.getAvaliacoes().add(avaliacao);
        avaliacao.acessarAvaliacaoFisica();

        System.out.println("\n6. LOGOUT:");
        aluno.realizarLogout();
        instrutor.realizarLogout();

        System.out.println("SISTEMA TECHGYM : TESTE FINALIZADO");
    }
}