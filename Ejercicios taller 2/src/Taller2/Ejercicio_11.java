
package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        int unidad,decena,centena,n;
        System.out.println("Digitar un numero de Rango (0-1000):  ");
        n=Integer.parseInt(leer.readLine());
        if(n<=1000){
        unidad=n%10;
        System.out.println("La unidad del numero es: "+unidad);
        n=n/10;
        decena=n%10;
        System.out.println("La decena del numero es: "+decena);
        centena=n/10;
        System.out.println("La centena del numero es: "+centena);
        }
        else{
            System.out.println("\tFUERA DE RANGO\nVerificar el numero digitado");
        }
    }
     
}
