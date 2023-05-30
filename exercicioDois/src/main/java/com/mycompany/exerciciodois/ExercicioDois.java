/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exerciciodois;

/**
 *
 * @author aluno
 */
public class ExercicioDois {

    public static void main(String[] args) {

        int[] vetorNumeros = {30, 50, 20, 10, 90, 70, 80};

        Ordenavel bb = (Ordenavel) new MetodoBolha();

        bb.ordenar(vetorNumeros);
    }
}
