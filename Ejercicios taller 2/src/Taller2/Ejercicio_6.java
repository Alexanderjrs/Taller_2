/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author acer
 */
public class Ejercicio_6 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        float peso,altura;
        System.out.println("Digitar su peso (KG):  ");
        peso=Float.parseFloat(leer.readLine());
        System.out.println("Digitar su altura (m):  ");
        altura=Float.parseFloat(leer.readLine());
        
        
        System.out.printf("La Masa Corporal es: %.2f\n",BMI(peso,altura));
       
    }
    public static double BMI(float a, float b){
           
        return  a/(b*b)  ;
    }
}
