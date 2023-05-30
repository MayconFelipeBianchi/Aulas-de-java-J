/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciodois;

/**
 *
 * @author aluno
 */
public class MetodoBolha {

    @Override
    public void ordenar(int[] vetorNumeros) {
        int chave;
        int j;
        boolean trocou = false;

        for (int i = 0; i < vetorNumeros.length; i++) {
            chave = vetorNumeros[i];
            for (j = i - 1; j >= 0 && vetorNumeros[j] > chave; j--) {
                vetorNumeros[j + 1] = vetorNumeros[j];
                trocou = true;

            }
            vetorNumeros[j + 1] = chave;
            if (!trocou) {
                break;
            }
        }
    }
}
