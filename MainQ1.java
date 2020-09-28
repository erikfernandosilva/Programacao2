/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quarentena1;

import static com.mycompany.quarentena1.Pessoa.getMaisAntigo;
import static com.mycompany.quarentena1.Pessoa.getMaisRapido;
import static com.mycompany.quarentena1.Pessoa.getSaldo;
import java.util.ArrayList;

/**
 *
 * @author ferna
 */

// criacao da classe Pessoa
class Pessoa{
    String nome;
    int idade;
    double altura;
    
    // criacao do construtor
    Pessoa (String nomep){
        nome = nomep;
    }
    
    public static void getMaisRapido(ArrayList lista_carros, Pessoa pessoa){
        double rapido = 0;
        String marca = " ";
        if (lista_carros.dono.equals(pessoa)){
            for (int i = 0; i < lista_carros.size();i++){
                if (lista_carros.get(i).vel_max > rapido){
                    rapido = lista_carros.get(i).vel_max;
                    marca = lista_carros.get(i).marca;
                }
            }
        System.out.println("O mais rápido é o: " + marca + " com velocidade de " + rapido);
        }
    }
    public static void getMaisAntigo(ArrayList lista_carros,Pessoa pessoa){
        int antigo = 3000;
        String marca1 = " ";
        if (lista_carros.dono.equals(pessoa)){
            for (int i = 0; i < lista_carros.size();i++){
                if (lista_carros.get(i).ano < antigo){
                    antigo = lista_carros.get(i).ano;
                    marca1 = lista_carros.get(i).marca;
                }
            }
        System.out.println("O mais antigo é o: " + marca1 + " de " + antigo);
        }
    }
    
    public static void getSaldo (ArrayList lista_contas,Pessoa pessoa){
        float total = 0;
        if (lista_contas.dono.equals(pessoa)){
            for (int i = 0; i < lista_contas.size(); i++) {
                total = total + lista_contas.get(i).saldo;
            }
            System.out.println("O total das contas é de: R$ " + total);
        }
    }
}

public class MainQ1 {
    public static void main (String[] args){
        
    // criacao do arraylist das pessoas
    ArrayList <Pessoa> lista_pessoas = new ArrayList();
     
    // criacao do arraylist dos carros, cada pessoa tem seu proprio arraylist
    ArrayList <CarroQ1> lista_carros = new ArrayList();
    
    // criacao do arraylist das contas, cada pessoa tem seu proprio arraylist
    ArrayList <ContaQ1> lista_contas= new ArrayList();
    
    // criacao das pessoas
    Pessoa fernando = new Pessoa ("Fernando");
    Pessoa patricia = new Pessoa ("Patricia");
        
    // adicionando elas ao arraylist
    lista_pessoas.add(fernando);
    lista_pessoas.add(patricia);
    
    // criacao dos carros e sua adicao ao arraylist
        // carros do fernando
        CarroQ1 toyota = new CarroQ1 ("Toyota",2018,50000,210,fernando);
        CarroQ1 porsche = new CarroQ1 ("Porsche",2020,250000,300,fernando);
        CarroQ1 omega = new CarroQ1 ("Chevrolet",1998,25000,185,fernando);
        
        lista_carros.add(toyota);
        lista_carros.add(porsche);
        lista_carros.add(omega);
    
        
        //carros da patricia
        CarroQ1 bmw3 = new CarroQ1 ("BMW",2017,125000,200,patricia);
        CarroQ1 passat = new CarroQ1 ("Volkswagen",2015,650000,170,patricia);
        CarroQ1 tt = new CarroQ1 ("Audi",2012,100000,285,patricia);
        
        lista_carros.add (bmw3);
        lista_carros.add (passat);
        lista_carros.add (tt);
        
    // criacao das contas e sua adicao ao arraylist
        // contas do fernando
        ContaQ1 f1 = new ContaQ1 (fernando,1000);
        ContaQ1 f2 = new ContaQ1 (fernando,2500);
        ContaQ1 f3 = new ContaQ1 (fernando,5000);
        
        lista_contas.add(f1);
        lista_contas.add(f2);
        lista_contas.add(f3);
        
        // contas da patricia
        ContaQ1 p1 = new ContaQ1 (patricia,3000);
        ContaQ1 p2 = new ContaQ1 (patricia,7500);
        
        lista_contas.add(p1);
        lista_contas.add(p2);
        
        getMaisRapido(lista_carros,fernando);
        getMaisAntigo(lista_carros,patricia);
        getSaldo(lista_contas,fernando);
        
    }
}
    
    // ------BREAKLINE------BREAKLINE-------BREAKLINE---------BREAKLINE---------
    
    /*
        mantido a fins de estudo
    // mostrar o carro mais rapido
    void getMaisRapido (CarroQ1 um,CarroQ1 dois){
       if (um.vel_max > dois.vel_max){
            System.out.println ("O " + um.marca + " é o mais rápido");
        }
        else {
            System.out.println ("O " + dois.marca + " é o mais rápido"); 
        }
    }
    
    void getMaisRapido (CarroQ1 um,CarroQ1 dois,CarroQ1 tres){
       if ((um.vel_max > dois.vel_max)&&(um.vel_max > tres.vel_max)){
            System.out.println ("O " + um.marca + " é o mais rápido");
        }
       else{
           if (dois.vel_max > tres.vel_max) {
               System.out.println ("O " + dois.marca + " é o mais rápido");
        }
           else {
               System.out.println ("O " + tres.marca + " é o mais rápido");
           }
    }
    }
    // mostrar o carro mais antigo
    void getMaisAntigo (CarroQ1 um, CarroQ1 dois){
        if (um.idade > dois.idade){
            System.out.println ("O " + um.marca + " é o mais antigo");
        }
        else {
            System.out.println("O " + dois.marca + " é o mais antigo");
        }
    }
    
    void getMaisAntigo (CarroQ1 um, CarroQ1 dois,CarroQ1 tres){
        if ((um.idade > dois.idade)&&(um.idade > tres.idade)){
            System.out.println ("O " + um.marca + " é o mais antigo");
        }
        else {
            if (dois.idade > tres.idade){
                System.out.println("O " + dois.marca + " é o mais antigo");
            }
            else {
                System.out.println("O" + tres.marca + " é o mais antigo");
            }
        }
    }*/
