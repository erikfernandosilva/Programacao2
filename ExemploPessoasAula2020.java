/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2102;

/**
 *
 * @author ferna
 */
public class ExemploPessoasAula2020 {
    // criacao da funcao apresentar, e seu comportamento,
    // independente de qual instancia da classe pessoa seja utilizada
    static void apresentar (Pessoa um) {
    System.out.println ("Olá, eu sou " + um.nome);
    System.out.println ("E tenho " + um.idade + " anos");
    System.out.println ("Eu tenho " + um.altura + " de altura");
    System.out.println ();
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criacao de p1 e atribuicao de valores
        Pessoa p1 = new Pessoa ();
        p1.nome = "Jose";
        p1.altura = 1.89;
        p1.idade = 25;
        
        // criacao de p2 e atribuicao de valores
        Pessoa p2 = new Pessoa ();
        p2.nome = "Fernando";
        p2.idade = 36;
        p2.altura = 1.75;
        
        // chamando a funcao apresentar para cada instancia
        apresentar (p1);
        apresentar (p2);
    }
}

// criacao da classe pessoa, com suas variaveis definidas
class Pessoa{
    String nome;
    int idade;
    double altura;
}
