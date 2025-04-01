/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author 100176476
 */
public class Main {

    public static void main(String[] args) {
        Reloj relojDeMesa = new Reloj(8,10,12);
        
        System.out.println("El reloj marca las: "+relojDeMesa.getHoras()+":"+relojDeMesa.getMinutos()+":" +relojDeMesa.getSegundos());
        
        System.out.println("Ahora el reloj marca las: "+relojDeMesa.tiempoMas(8));
        System.out.println("El reloj marca las: "+relojDeMesa.getHoras()+":"+relojDeMesa.getMinutos()+":" +relojDeMesa.getSegundos());

    }
}
