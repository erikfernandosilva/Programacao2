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
public class GerenteQ2 extends FuncionarioQ2{
    protected double bonificacao;
    GerenteQ2 (String nomeP, double bonusP){
        super (nomeP);
        bonificacao = bonusP;
    }
    
     public double getSalario(){
        return (bonificacao);
    }
}
