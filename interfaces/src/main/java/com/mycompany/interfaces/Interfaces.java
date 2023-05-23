/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.interfaces;

/**
 *
 * @author aluno
 */
public class Interfaces {

    public static void main(String[] args) {
        
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo Animal = new animal();
        
        carro.acelerar();
        moto.frear();
        Animal.frear();
    }
  }
