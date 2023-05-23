/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author aluno
 */
public class Moto implements Veiculo{
        public int corteGiro;
        
        @Override
    public void acelerar(){
        System.out.println("");
    }
        @Override
    public void frear(){
        System.out.println("A moto esta freiando");
    }
}
