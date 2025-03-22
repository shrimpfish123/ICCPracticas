/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.proyecto1;

/**
 *
 * @author 100176476
 */
public class Recipiente implements ServiciosRecipiente{
    private final int altura;
    private final int radio;
    private final double volumen;
    private double liquido;
   
    
    public Recipiente (int altura, int radio){
        this.altura = altura;
        this.radio = radio;
        this.volumen = this.altura * Math.PI + Math.pow(this.radio, 2);;
        this.liquido = 0.0;
    }
    
    
    
    public double capacidad(){
        double capacidad = this.volumen ;
        return capacidad;
    }
    
    
    public double capacidadRestante(){
        double capRest = this.volumen - this.liquido;
        return capRest;
    }
    
    
    public boolean estaVacio(){
        return this.liquido == 0;
    }
    
    
    public boolean estaLleno(){
        return this.liquido == this.volumen;
    }
    
    
    public double rellena(double capacidad){
        if(capacidad + this.liquido > this.volumen){
            this.liquido = this.volumen;
            capacidad = capacidad + this.liquido - this.volumen;
            System.out.println("Se lleno y el restante es el siguiente: " );
            
        }else if(capacidad + this.liquido < this.volumen){
            this.liquido = capacidad + this.liquido;
            capacidad = 0;
            System.out.println("No se lleno");
            
        }
        return capacidad;
    }
    
    
    public double vacia(){
        this.liquido = 0.0;
        return liquido;
    }
    
    
    public void vierte (Recipiente otro){
        if(otro.liquido + this.liquido > otro.volumen){
            otro.liquido = otro.volumen;
            this.liquido = otro.liquido + this.liquido - otro.volumen;
            
        }else if(otro.liquido + this.liquido <= otro.volumen){
            otro.liquido = otro.liquido + this.liquido;
            this.liquido = 0;
        }
        System.out.println("El liquido del recipiente es de: " + otro.liquido );
        System.out.println("Y la jarra tiene: "+this.liquido);
    }
    
    
    public boolean mismasDimensiones ( Recipiente otro ){
        if(otro.radio == this.radio && otro.altura == this.altura){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean mismaCapacidad(Recipiente otro){
        if(otro.volumen == this.volumen){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean contieneMas(Recipiente otro){
        if(otro.liquido > this.liquido){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean cabeMas(Recipiente otro){
        if(otro.capacidadRestante() > capacidadRestante()){
         return true;   
        }else{
            return true;
        }
    }
    
    
    public Recipiente creaContenedorJusto(){
        Recipiente nuevo = new Recipiente(this.altura,this.radio);
        return nuevo;
    }
    
    
    public String muestra(){
        String datos = "DIMENSIONES: \n Atura: " + this.altura 
                            + "\n Radio: " + this.radio 
                            + "\n CAPACIDAD: "  + this.volumen 
                            + "\n LIQUIDO ACTUAL:"+this.liquido ;
        return datos;
        
    }
}
