/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author ferna
 */
public class FuncionarioTemporizadores3 {
    protected String nome;
    protected String rg;
    protected float salarioBase = 1000;
    
    FuncionarioTemporizadores3 (String nomeP){
        nome = nomeP;
    }
    
    public double getSalario (){
        return salarioBase;
    }
}
