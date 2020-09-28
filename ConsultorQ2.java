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
public class ConsultorQ2 extends FuncionarioQ2{
    protected double valorHora;
    protected double horasTrabalhadas;
    ConsultorQ2 (String nomeP, double valorP,double horasP){
        super (nomeP);
        valorHora = valorP;
        horasTrabalhadas = horasP;
    }
    
    public double getSalario(){
        return (horasTrabalhadas * valorHora);
    }
}
