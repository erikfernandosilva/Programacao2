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
public class VendedorQ2 extends FuncionarioQ2{
    protected int numeroVendas;
    protected double comissao;
    VendedorQ2 (String nomeP,int vendasP,double comissaoP){
        super (nomeP);
        numeroVendas = vendasP;
        comissao = comissaoP;
    }
    
    public double getSalario (){
        return (numeroVendas * comissao);
    }
}
