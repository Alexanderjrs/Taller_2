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
public class Ejercicio_10 {
   
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        float peso;
        System.out.println("Digitar  el peso (KG):  ");
        peso=Float.parseFloat(leer.readLine());
     
        System.out.printf("su coversion a gramos es: %.2f\n", Gramos(peso));
        System.out.printf("su coversion a libras es: %.2f\n",libras(peso));
        System.out.printf("su coversion a toneladas es: %.2f\n",toneladas(peso));
       
    }
    public static double Gramos(float a){
           
        return a*1000  ;
    }
    public static double libras(float a){
           
        return a* (2.20462) ;
    }
public static double toneladas(float a){
           
        return a/1000  ;
    }


    
}
