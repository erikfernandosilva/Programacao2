/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore;

/**
 *
 * @author ferna
 */
public class ArvoreBinaria{
    NodoBinaria root;
    int maior;
    int menor;
    int pares;
    int soma;
    
    // estrutura da arvore
    ArvoreBinaria(){
        root = null;
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;
        pares = 0;
        soma = 0;
    }
    
    // imprimir valores
    void imprimir(){
        imprimirNodos(root);
    }
    
    // o que realmente imprime valores
    void imprimirNodos(NodoBinaria raiz){
        if (raiz != null){
            System.out.println(raiz.conteudo);
            imprimirNodos(raiz.left);
            imprimirNodos(raiz.right);
        }
    }
    
    // retornar o maior
    int retornarMaior(NodoBinaria atual){
        if (atual != null){
            retornarMaior(atual.left);
            retornarMaior(atual.right);
            if (atual.conteudo > maior){
                maior = atual.conteudo;
            }
        }
        return maior;
    }
    
    // retornar o menor
    int retornarMenor(NodoBinaria atual){
        if (atual != null){
            retornarMenor(atual.left);
            retornarMenor(atual.right);
            if (atual.conteudo < menor){
                menor = atual.conteudo;
            }
        }
        return menor;
    }
    
    // retornar os pares
    int retornarPares(NodoBinaria atual){
        if (atual != null){
            retornarPares(atual.left);
            retornarPares(atual.right);
            if (atual.conteudo % 2 == 0){
                this.pares++;
            }
        }
        return pares;
    }
    
    // fazer o somatorio
    int somatorio (NodoBinaria atual){
         if (atual != null){
            somatorio(atual.left);
            somatorio(atual.right);
            soma = soma + atual.conteudo;
        }
        return soma;
    }
    
    // pesquisar valores
    void pesquisar (NodoBinaria atual,int valor){
        if (atual.conteudo == valor){
            System.out.println("Achei o " + valor + "! :)");
        }
        else{
            try{
                if (atual.conteudo > valor){
                    System.out.println("Olhando na esquerda");
                    pesquisar(atual.left,valor);
                }
                else{
                    System.out.println("Olhando na direita");
                    pesquisar(atual.right,valor);
                }
            }
            catch (NullPointerException x){
                System.out.println("Não achei o " + valor + " :/");
            }
        }
    }
    
    // principal
    public static void main (String[] args){
        ArvoreBinaria madeira = new ArvoreBinaria();
        // valor da raiz
        madeira.root = new NodoBinaria(20);
        
        // subarvore da esquerda
        madeira.root.left = new NodoBinaria(17);
        madeira.root.left.left = new NodoBinaria(15);
        madeira.root.left.right = new NodoBinaria(19);
        
        // subarvore da direita
        madeira.root.right = new NodoBinaria(22);
        madeira.root.right.left = new NodoBinaria(21);
        madeira.root.right.right = new NodoBinaria(27);
        
        madeira.imprimir();
        System.out.println(" ");
        System.out.println(madeira.retornarMaior(madeira.root));
        System.out.println(" ");
        System.out.println(madeira.retornarMenor(madeira.root));
        System.out.println(" ");
        System.out.println(madeira.retornarPares(madeira.root));
        System.out.println(" ");
        System.out.println(madeira.somatorio(madeira.root));
        System.out.println(" ");
        System.out.println(" pesquisas: ");
        madeira.pesquisar(madeira.root, 17);
        System.out.println(" ");
        madeira.pesquisar(madeira.root, 19);
        System.out.println(" ");
        madeira.pesquisar(madeira.root, 21);
        System.out.println(" ");
        madeira.pesquisar(madeira.root, 27);
        System.out.println(" ");
        madeira.pesquisar(madeira.root, -10);
        System.out.println(" ");
        madeira.pesquisar(madeira.root, 150);
    }
}
