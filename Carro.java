package ooexemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFFarroupilha
 */
public class Carro {
    String marca;
    int ano;
    double valor;
    double vel_max;
    void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);
    }
    void depreciar(){
        // sem parametro
        valor -= 100;
        System.out.println (valor);
        if (valor < 0){
            valor = 0;
        }
    }
    void queda (int valorqueda){
        // com parametro
        valor = valor - valorqueda;
        System.out.println (valor);
    }
    void correr (float vel){
        if (vel > vel_max){
            System.out.println (vel_max);
        }
        else{
            System.out.println (vel);
        }
    }
}
