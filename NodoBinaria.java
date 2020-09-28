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
public class NodoBinaria {
    int conteudo;
    NodoBinaria left;
    NodoBinaria right;
    
    NodoBinaria(){
        conteudo = 0;
        left = null;
        right = null;
    }
    
    NodoBinaria(int conteudo){
        this.conteudo = conteudo;
        left = null;
        right = null;
    }
}
