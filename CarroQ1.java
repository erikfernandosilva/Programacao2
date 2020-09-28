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
// criacao da classe carro
public class CarroQ1 {
    String marca;
    int ano;
    int idade;
    double valor;
    double vel_max;
    Pessoa dono;
    
    // criacao do construtor
    CarroQ1 (String marcap,int anop,float valorp,int velp,Pessoa novo_dono){
	marca = marcap;
	ano = anop;
	valor = valorp;
	idade = 2020 - ano;
	vel_max = velp;
        dono = novo_dono;
    }
     
}
