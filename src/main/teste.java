package main;

import classes.Aluno;
import classes.Instrutor;
import classes.Usuario;

class teste {
    public static void main (String[] args) {
        
        Usuario PrimeiroUsuario = new Usuario ("Safira", "safira@gmail.com", "Safira123");
        System.out.println ("Usuário criado: " + PrimeiroUsuario.getNome());
    }
}