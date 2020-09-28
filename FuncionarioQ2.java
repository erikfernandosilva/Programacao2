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

// esta é a classe principal
// as subclasses sao: Vendedor, Consultor, Gerente
public class FuncionarioQ2 {
    protected String nome;
    protected String rg;
    protected float salarioBase = 1000;
    
    FuncionarioQ2 (String nomeP){
        nome = nomeP;
    }
    
    public double getSalario (){
        return salarioBase;
    }
}
