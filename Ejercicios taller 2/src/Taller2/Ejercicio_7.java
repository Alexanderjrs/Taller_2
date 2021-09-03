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
public class Ejercicio_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        float precom,preven;
        System.out.println("digitar el precio de compra :  ");
        precom=Float.parseFloat(leer.readLine());
        System.out.println("digitar el precio de venta :  ");
        preven=Float.parseFloat(leer.readLine());
        
    
        
        System.out.printf("El porcentaje de utilidad es: %.2f\n",utilidad(precom,preven));
        
    }
    public static double utilidad(float a, float b){
           float ut= (b-a)/b;
        return ut*100  ;
    }

}
