/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author 100176476
 */
public class Reloj {
    // ATRIBUTOS
    private int segundos;
    private int minutos;
    private int horas;
    
    // METODO CONSTRUCTOR
    public Reloj(int segundos, int minutos, int horas){
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }
    
    //METODO PARA SUMAR SEGUNDOS/MINUTOS/HORAS
    public String tiempoMas(int sec){
        this.segundos = this.segundos + sec;
        if(this.segundos >=60){
            this.segundos = 0;
            ++this.minutos;
            if(this.minutos >=60){
                this.minutos = 0;
                ++this.minutos;
                if(this.horas >= 24){
                    this.horas = 0;
                }
            }
        }
        String Hora = ""+this.horas;
        String Minuto = ""+this.minutos;
        String Segundo = ""+this.segundos;
        String cero = "0";
        
        if(horas < 10) cero.concat(Hora);
        if(minutos < 10) cero.concat(Minuto);
        if(segundos < 10) cero.concat(Segundo);
        
        String laHora = Hora +":"+Minuto+":"+ Segundo;
        return laHora;
        
        
        
        }
    //METODO PARA IMPRIMIR LA HORA
    public String laHora(){
        String Hora = ""+this.horas;
        String Minuto = ""+this.minutos;
        String Segundo = ""+this.segundos;
        String cero = "0";
        
        if(horas < 10) cero.concat(Hora);
        if(minutos < 10) cero.concat(Minuto);
        if(segundos < 10) cero.concat(Segundo);
        
        String laHora = Hora +":"+Minuto+":"+ Segundo;
        return laHora;
    }
}
