/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.temporizadores.atividade1;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author ferna
 */

/*
Atividade 1
    Faça um programa que inicia com uma Pilha de cartas, 
    e a cada segundo vai tirando a carta mais de cima.
    Quando chegar no final da pilha, a TimerTask deve parar de ser chamada
*/

public class MainTemporizador {
    public static void main(String[] args){
        // criacao da pilha de cartas e adicao das cartas
        Stack<String> cartas = new Stack<>();
        cartas.push("As de Espadas");
        cartas.push("2 de Copas");
        cartas.push("3 de Paus");
        cartas.push("4 de Ouros");
        cartas.push("Coringa");
        
        // criacao do timer
        Timer timer = new Timer ();
        
        // ele vai repetir a cada 1 segundo
        final long segundos = 1000;
        
        // criacao da atividade e sua declaracao
        TimerTask atividade1;
        atividade1 = new TimerTask(){
            @Override
            // parte que vai ser repetida
            public void run() {
                System.out.println(cartas.pop());
                // quando a pilha estiver vazia, ele termina a execucao
                if (cartas.empty() == true){
                    System.exit(0);
                }
            }
            
        };
        /* chamada do timer, para a atividade1, comecando de imediato (zero segundos),
        com intervalo de execucao de 1 segundo */       
        timer.scheduleAtFixedRate(atividade1, 0, segundos);
    }
}