/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooexemplos;

/**
 *
 * @author IFFarroupilha
 */
public class OOExemplos {

    /**
     * @param args the command line arguments
     */
    
    // nesta funcao, sao chamados duas instancias da mesma classe
    // e feita a comparacao de quem tem a velocidade maior
     static void maisrapidos (Carro M1,Carro M2){
        if (M1.vel_max > M2.vel_max){
            System.out.println ("O " + M1.marca + " é o mais rápido");
        }
        else {
            System.out.println ("O " + M2.marca + " é o mais rápido");
        }
    }
    
    // nesta funcao, sao chamados duas instancias da mesma classe
    // e feita a comparacao de quem é o mais velho
     static void antigo (Carro um, Carro dois){
         if (um.ano < dois.ano){
             System.out.println ("O mais velho é o primeiro, de " + um.ano);
         }
         else{
             System.out.println ("O mais velho é o segundo, de " + dois.ano);
         }
     }
    
    //classe principal
    public static void main(String[] args){
        // criacao de uma instancia da classe carro
        // e sua inicializacao de valores
        Carro carro1 = new Carro();
        carro1.ano = 1996;
        carro1.marca = "BMW";
        carro1.valor = 10000.00;
        
        // criacao de uma segunda instancia da classe carro
        // e sua inicializacao de valores
        Carro carro2 = new Carro();
        carro2.ano = 2019;
        carro2.marca = "Mercedes AMG";
        carro2.valor = 5242.65;
        
         // exibicao da marca do carro 1 , e da marca e ano do carro 2
        System.out.println ("Marca: " + carro1.marca);
        System.out.println ();
        System.out.println ("Ano é: " + carro2.ano + " E marca é: " + carro2.marca);
        System.out.println ();
        
        // sistema para saber qual é o mais caro
        if (carro1.valor > carro2.valor){
            System.out.println ("O carro 1 é mais caro");
        }
        else{
            System.out.println ("O carro 2 é mais caro");
        }
        
         // chamando a funcao imprimir, que está 
        // no documento carro.java
        carro1.imprimir();
        carro2.imprimir();
        
        carro2.depreciar();
        
        // aqui um exemplo de utilizacao com parametros, definidos no codigo
        // para melhor compreensao, leia o carro.java
        System.out.println ();
        carro1.queda(1500);
        
        carro1.vel_max = 287.05;
        carro2.vel_max = 305.85;
        
        carro1.correr(400);
        carro2.correr(200);
        
         // inicializacao das duas funcoes escritas acima no codigo
        maisrapidos (carro1,carro2);
        antigo (carro1,carro2);
    }
}



