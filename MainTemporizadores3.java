/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author ferna
 */

/*
Exercício 3
    Utilize a classe ConsultorTemporizadores3 previamente implementada
    Cria uma ArrayList com 3 Consultores (devem possuir diferentes valorHora)
    A cada 1 segundo, todos os Consultores da Lista devem registrar 2h de trabalho
    O programa deve parar de registrar horas após 15 segundos
    Quando parar de registrar, deve mostrar na tela o salário de cada ConsultorTemporizadores3
*/

public class MainTemporizadores3{
    public static void main (String[] args){
        // criacao do arraylist
        ArrayList <String> consultores = new ArrayList();
        
        // criacao dos consultores
        ConsultorTemporizadores3 lucas = new ConsultorTemporizadores3 ("Lucas",25.85,0);
        ConsultorTemporizadores3 marcia = new ConsultorTemporizadores3 ("Marcia",30.42,0);
        ConsultorTemporizadores3 helderus = new ConsultorTemporizadores3 ("Helderus",36.89,0);

        // o arraylist apenas suportou o nome
        consultores.add (lucas.nome);
        consultores.add (marcia.nome);
        consultores.add(helderus.nome);
        
        // criacao do timer e do intervalo de repeticao
        Timer timer = new Timer ();
        final long segundos = 1000;
        
        // criacao da atividade
        TimerTask atividade3 = new TimerTask(){
            int contador;
            @Override
            public void run() {
                // a cada ciclo somar duas horas de trabalho
                lucas.horasTrabalhadas += 2;
                marcia.horasTrabalhadas += 2;
                helderus.horasTrabalhadas += 2;
                contador++;
                System.out.println("Rodando a " + contador + " segundos");
                
                // quando o contador chegar em 15, a atividade para
                if (contador >= 15){
                    System.out.println( );
                    System.out.println("=======================================");
                    System.out.println("|| O salario de " + lucas.nome + " é de " + lucas.getSalario() + "     ||");
                    System.out.println("|| O salario de " + marcia.nome + " é de " + marcia.getSalario() + "    ||");
                    System.out.println("|| O salario de " + helderus.nome + " é de " + helderus.getSalario() + " ||");
                    System.out.println("=======================================");
                    System.exit(0);
                }
            }  
        };
        // chamada do timer
        timer.scheduleAtFixedRate(atividade3, 0, segundos);
    }
}
