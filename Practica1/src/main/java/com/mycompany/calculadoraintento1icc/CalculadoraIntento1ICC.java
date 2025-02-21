/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraintento1icc;
import java.util.Scanner;
/**
 *
 * @author 100176476
 */
public class CalculadoraIntento1ICC {

    public static void main(String[] args) {
        Scanner cursor = new Scanner(System.in);
        int cursorR;
        
        
        System.out.println("CALCULDORA");
        System.out.println("SUMA, digita un 0");
        System.out.println("MULTIPLICACION, digita 1");
        System.out.println("DIVISION, digita 2");
        System.out.println("Mi opinion sobre el usuario, digita 100");
        cursorR = cursor.nextInt();
    
        if(cursorR == 0){
            System.out.println("Digite el primer numero que quieres sumar:");
            double x = cursor.nextDouble();
            System.out.println("Digite el segundo numero a sumar: ");
            double y = cursor.nextDouble();
            double suma = x + y;
            System.out.println("EL RESULTADO ES:"+suma);
        }else if( cursorR == 1 && cursorR <100){
           System.out.println("Digite el primer numero que quieres multiplicar:");
            double x = cursor.nextDouble();
            System.out.println("Digite el segundo numero a multiplicar: ");
            double y = cursor.nextDouble();
            double suma = x * y;
            System.out.println("EL RESULTADO ES:"+suma); 
        }else if(cursorR == 100){
            System.out.println("ERES EL MEJOR USUARIO");
            System.out.println("<3");
        }else if(cursorR == 2){
            System.out.println("Digite el primer numero que quieres dividir:");
            double x = cursor.nextDouble();
            System.out.println("Digite el numero que va a dividir al anterior: ");
            double y = cursor.nextDouble();
            double suma = x / y;
            System.out.println("EL RESULTADO ES:"+suma); 
        }
    }
}