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
public class Ejercicio_2 {
    //Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario e imprima la
    //suma, producto, diferencia de los números.
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        int n1,n2;
        System.out.println(" Digitar primer numero  ");
        n1=Integer.parseInt(leer.readLine());
        System.out.println(" Digitar ultimo numero  ");
        n2=Integer.parseInt(leer.readLine());
          
       
        System.out.printf("La suma es: %d\n", suma(n1,n2));
      
        System.out.printf("El producto es: %d\n", producto(n1,n2));
       
        System.out.printf ("La diferencia es: %d\n", Diferencia(n1,n2));
    }
    
    public static int suma(int a, int b){
           
        return  a + b ;
    }
    public static int producto(int a, int b){
           
        return  a * b ;
    }
    public static int Diferencia(int a, int b){
           
        return  a - b ;
    }
}
