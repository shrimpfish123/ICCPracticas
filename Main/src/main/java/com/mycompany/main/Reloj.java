/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author 100176476
 */
public class Reloj {
    // ATRIBUTOS
    private int segundos;
    private int minutos;
    private int horas;
    private String cero = "0";
  
    
    // METODO CONSTRUCTOR
    public Reloj(int segundos, int minutos, int horas){
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getHoras() {
        return horas;
    }
    
    
    //METODO PARA SUMAR SEGUNDOS/MINUTOS/HORAS
    public String tiempoMas(int sec){
        for(int i = 0; i < sec; i++){
            ++this.segundos;
            if(this.segundos == 60){
                this.segundos = 0;
                ++this.minutos;
            }
            if(this.minutos == 60){
                this.minutos = 0;
                ++this.horas;
            }
            if(this.horas == 24){
                this.horas = 0;
            }
        }
        
        String nuevaSegundos = this.segundos < 10 ? "0" + this.segundos : "" + this.segundos;
        String nuevaMinutos= this.minutos < 10 ? "0" + this.minutos : "" + this.minutos;
        String nuevaHora = this.horas < 10 ? "0" + this.horas : "" + this.horas;
        
        
        String laHora = nuevaSegundos + nuevaMinutos + nuevaHora;
        return laHora;
        }
}
