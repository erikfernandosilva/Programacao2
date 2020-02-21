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
    
     static void maisrapidos (Carro M1,Carro M2){
        if (M1.vel_max > M2.vel_max){
            System.out.println ("O " + M1.marca + " é o mais rápido");
        }
        else {
            System.out.println ("O " + M2.marca + " é o mais rápido");
        }
    }
    
     static void antigo (Carro um, Carro dois){
         if (um.ano < dois.ano){
             System.out.println ("O mais velho é o primeiro, de " + um.ano);
         }
         else{
             System.out.println ("O mais velho é o segundo, de " + dois.ano);
         }
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro();
        carro1.ano = 1996;
        carro1.marca = "BMW";
        carro1.valor = 10000.00;
        
        Carro carro2 = new Carro();
        carro2.ano = 2019;
        carro2.marca = "Mercedes AMG";
        carro2.valor = 5242.65;
        
        System.out.println ("Marca: " + carro1.marca);
        System.out.println ();
        System.out.println ("Ano é: " + carro2.ano + " E marca é: " + carro2.marca);
        System.out.println ();
        
        if (carro1.valor > carro2.valor){
            System.out.println ("O carro 1 é mais caro");
        }
        else{
            System.out.println ("O carro 2 é mais caro");
        }
        
        carro1.imprimir();
        carro2.imprimir();
        
        carro2.depreciar();
        
        System.out.println ();
        carro1.queda(1500);
        
        carro1.vel_max = 287.05;
        carro2.vel_max = 305.85;
        
        carro1.correr(400);
        carro2.correr(200);
        
        maisrapidos (carro1,carro2);
        antigo (carro1,carro2);
    }
}



