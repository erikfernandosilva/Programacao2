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

// essa classe conecta-se com o OOExemplos.java
// criacao da classe carro e inicializacao de valores
public class Carro {
    String marca;
    int ano;
    double valor;
    double vel_max;
    
    //criacao da funcao imprimir
    // o void significa que não é esperado retorno para a propria funcao
    void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);
    }
    void depreciar(){
        // sem parametro
        // isso significa que o valor nao é informado
        valor -= 100;
        System.out.println (valor);
        if (valor < 0){
            valor = 0;
        }
    }
    void queda (int valorqueda){
        // com parametro
        // o valor de queda é informado diretamente no codigo
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
