/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolista;

/**
 *
 * @author IFFarroupilha
 */
public class ExemploLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criacao e inicializacao da listas
        Lista l1 = new Lista ();
        Lista lj = new Lista ();
        Lista l2 = new Lista ();
        Lista ln = new Lista ();
        Lista l3 = new Lista ();
        
        l1.valor = 30;
        lj.valor = 10;
        l2.valor = 5;
        l1.prox = lj;
        lj.prox = l2;
        l2.prox = ln;
        ln.valor = 568;
        ln.prox = l3;
        l3.valor = 44;

        // Imprime valor de l1
        System.out.println (l1.valor);
        
        // imprime valor de l2
        System.out.println (l1.prox.valor);
        
        // imprime valor de l3
        System.out.println (l2.prox.valor);
        
        // outra forma de imprimir o l3
        System.out.println (l1.prox.prox.valor);
        
        // valor de l4
        System.out.println (l1.prox.prox.prox.valor);
        
        // valor do ultimo item
        System.out.println (l1.prox.prox.prox.prox.valor);
        
        }
    }

// criacao da classe lista
class Lista {
    int valor;
    Lista prox;
}
