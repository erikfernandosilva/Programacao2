/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ferna
 */

/*
Exercício 2
    Faça um programa que inicia com uma Fila vazia e a cada 2 segundos 
    adiciona 2 elementos (podem ser inteiros).
    O programa deve parar de adicionar quando a Fila tiver tamanho maior que 30
*/

public class MainTemporizadores2 {
    public static void main (String[] args){
        // criacao da fila
        Queue<Integer> elementos = new LinkedList<>();
        
        // criacao dos dois numeros aleatorios
        Random numero1 = new Random();
        Random numero2 = new Random();
        
        // criacao do timer
        Timer timer = new Timer ();
        
        // ele vai repetir a cada 2 segundos
        final long segundos = 2000;
        
        // criacao da atividade e sua declaracao
        TimerTask atividade2 = new TimerTask(){
            int contador;
            @Override
            // parte que vai ser repetida
            public void run() {
                // adicao dos dois numeros na fila
                elementos.add(numero1.nextInt());
                elementos.add(numero2.nextInt());
                System.out.println("Rodando a " + contador + " segundos");
                contador += 2;
                //quando houver mais de 30 numeros, mostrar todos e parar
                if (elementos.size() > 30){
                    System.out.println( );
                    for (int i : elementos) System.out.println(i);
                    System.exit(0);
                }
            }
        };
        /* chamada do timer, para a atividade2, comecando de imediato (zero segundos),
        com intervalo de execucao de 2 segundos */       
        timer.scheduleAtFixedRate(atividade2, 0, segundos);
    }
}
