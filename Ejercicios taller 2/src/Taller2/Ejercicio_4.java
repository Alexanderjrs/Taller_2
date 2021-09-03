/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Escriba un programa en Java que le solicite al usuario el valor del 
radio de una circunferencia y calcule su longitud y
área. Imprima los resultados (con dos números decimales)
 */
public class Ejercicio_4 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        float r;
        
        System.out.println("por favor digite el radio de la circunferencia:  ");
        r=Float.parseFloat(leer.readLine());
        
        System.out.printf("La longitud es: %.2f\n",longitud(r));
        System.out.printf("La Area es: %.2f\n",area(r));
        
    }
    
    public static double longitud(float a){
           float longi=2*a;
        return  Math.PI*longi  ;
    }
    public static double area(float a){
           float area=a*a;
        return  Math.PI*area  ;
    }
}
