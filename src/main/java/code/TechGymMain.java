package code;

import classes.*;

import java.util.Calendar;
import java.util.Date;

public class TechGymMain {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA TECHGYM INICIANDO ===\n");

        // Criar planos
        Plano planoBasico = new Plano(1, "Básico", "Acesso à musculação", 80.0, 1);
        Plano planoPremium = new Plano(2, "Premium", "Acesso completo + aulas coletivas", 120.0, 1);

        // Criar aluno
        Aluno aluno = new Aluno(
            "Carlos Silva",
            "carlos@email.com",
            "senha123",
            1001,
            "123.456.789-00",
            new Date(95, Calendar.JULY, 15) // 15/06/1995
        );

        // Criar instrutor
        Instrutor instrutor = new Instrutor(
            "Ana Souza",
            "ana@techgym.com",
            "instr123",
            2001
        );

        System.out.println("1. LOGIN:");
        aluno.realizarLogin("carlos@email.com", "senha123");
        instrutor.realizarLogin("ana@techgym.com", "instr123");

        System.out.println("\n2. MATRÍCULA E PAGAMENTO:");
        aluno.realizarMatricula(planoPremium);
        aluno.realizarPagamento(120.0, "Cartão de Crédito");

        System.out.println("\n3. INSTRUTOR GERENCIANDO ALUNO:");
        instrutor.adicionarAluno(aluno);
        instrutor.liberarAcesso(aluno);
        instrutor.visualizarAluno(aluno);

        System.out.println("\n4. FICHA DE TREINO:");
        String[] exercicios = {"Supino Reto", "Agachamento Livre", "Remada Curvada", "Desenvolvimento"};
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

        System.out.println("\n=== SISTEMA TECHGYM FINALIZADO ===");
    }
}

