/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Digitar un caracter: ");
        char ct=leer.next().charAt(0);
        int num=(int)ct;
        System.out.println("Se representa con el numero: "+num);
    }
}
