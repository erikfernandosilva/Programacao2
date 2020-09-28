/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quarentena1;

/**
 *
 * @author ferna
 */
// criacao da classe
public class ContaQ1 {
    float saldo;
    private Pessoa dono;
    
    // criacao do construtor
    ContaQ1 (Pessoa novo_dono,int valor_saldo){
        dono = novo_dono;
        saldo = valor_saldo;
    }
    
    /* mantido a fins de estudo
    // retornar o saldo de todas as contas
    public void getSaldo(ContaQ1 um){
        System.out.println ("Total: " + um.saldo);
    }
    
    public void getSaldo(ContaQ1 um,ContaQ1 dois){
        float total;
        total = um.saldo + dois.saldo;
        System.out.println ("Total: " + total);
    }
    
    public void getSaldo(ContaQ1 um,ContaQ1 dois,ContaQ1 tres){
        float total;
        total = um.saldo + dois.saldo + tres.saldo;
        System.out.println ("Total: " + total);
    }*/
    
}
