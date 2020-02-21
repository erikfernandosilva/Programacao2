/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopessoas;

/**
 *
 * @author IFFarroupilha
 */
public class ExemploPessoas {
    
    static void apresentar (Pessoa um) {
    System.out.println ("Olá, eu sou " + um.nome);
    System.out.println ("E tenho " + um.idade + " anos");
    System.out.println ("Eu tenho " + um.altura + " de altura");
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa ();
        p1.nome = "Jose";
        p1.altura = 1.89;
        p1.idade = 25;
        
        Pessoa p2 = new Pessoa ();
        p2.nome = "Fernando";
        p2.idade = 36;
        p2.altura = 1.75;
        
        apresentar (p1);
        apresentar (p2);
    }
    
}

class Pessoa{
    String nome;
    int idade;
    double altura;
}
