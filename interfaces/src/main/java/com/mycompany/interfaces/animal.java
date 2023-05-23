/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author aluno
 */
public class animal implements Veiculo{

     @Override
     public void acelerar(){
        System.out.println("O animal esta acelerando");
    }
        @Override
    public void frear(){
        System.out.println("A animal esta freiando");
    }
     
}
