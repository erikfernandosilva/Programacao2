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
public class ConsultorTemporizadores3 extends FuncionarioTemporizadores3{
    protected double valorHora;
    protected double horasTrabalhadas;
    ConsultorTemporizadores3 (String nomeP, double valorP,double horasP){
        super (nomeP);
        valorHora = valorP;
        horasTrabalhadas = horasP;
    }
    
    public double getSalario(){
        return (horasTrabalhadas * valorHora);
    }
}
