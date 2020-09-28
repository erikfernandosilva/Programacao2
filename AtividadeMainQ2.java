/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quarentena2;

/**
 *
 * @author ferna
 */
public class AtividadeMainQ2 {
    public static void main (String[] args){
        // criação de um funcionario
        FuncionarioQ2 joao = new FuncionarioQ2 ("João");
        joao.rg = "369851400";
        
        // criacao do vendedor
        VendedorQ2 tadeu = new VendedorQ2 ("Tadeu",10,20.5);
        VendedorQ2 victor = new VendedorQ2 ("Victor",20,30.5);
        
        // criacao do consultor
        ConsultorQ2 julia = new ConsultorQ2 ("Julia",5.95,40.5);
        ConsultorQ2 eduardo = new ConsultorQ2 ("Eduardo",4.20,60);
        
        // criacao do gerente
        GerenteQ2 fabricio = new GerenteQ2 ("Fabricio",2598.56);
        GerenteQ2 bruno = new GerenteQ2 ("Bruno",2499.56);
        
        // zona de testes
        System.out.println("o funcionario " + joao.nome + " tem o rg: " + joao.rg);
        System.out.println("o vendedor " + tadeu.nome + " tem a comissao de: " + tadeu.comissao + "reais");
        System.out.println("a consultora " + julia.nome + " trabalhou esta quinzena " + julia.horasTrabalhadas + " horas");
        System.out.println("o gerente " + fabricio.nome + " vai receber bonus de " + fabricio.bonificacao + " reais");
        
        // testes de salarios
        System.out.println(" ");
        System.out.println("Testes dos salarios:");
        System.out.println("Salario " + joao.nome + " é de " + joao.getSalario());
        System.out.println("Salario " + victor.nome + " é de " + victor.getSalario());
        System.out.println("Salario " + eduardo.nome + " é de " + eduardo.getSalario());
        System.out.println("Salario " + bruno.nome + " é de " + bruno.getSalario());
    }
}
