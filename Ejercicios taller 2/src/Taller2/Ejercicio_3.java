
package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Escriba una aplicación que reciba tres valores decimales del usuario y muestre 
//la suma, promedio, producto, cociente
//y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas.
public class Ejercicio_3 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        
        float n1,n2,n3;
        System.out.println("Digite un numero decimal:  ");
        n1=Float.parseFloat(leer.readLine());
        System.out.println("digite un numero decimal:  ");
        n2=Float.parseFloat(leer.readLine());
        System.out.println("Digite un numero decimal:  ");
        n3=Float.parseFloat(leer.readLine()); 
        
       
        System.out.printf("La suma es: %.2f\n ",suma(n1,n2,n3));
        System.out.printf("El producto es: %.2f\n ",producto(n1,n2,n3));
        System.out.printf("El cociente es: %.2f\n ",cociente(n1,n2,n3));
        System.out.printf("El promedio es: %.2f\n ",Promedio(n1,n2,n3));
       System.out.printf("El modulo es: %.2f\n ",modulo(n1,n2,n3));
        
    }
    public static double suma(float a, float b, float c){
           
        return  a + b + c ;
    }
    
    public static double producto(float a, float b, float c){
           
        return  a * b * c ;
    }
    public static double cociente(float a, float b, float c){
           
        return  a / b / c ;
    }
    public static double Promedio(float a, float b, float c){
           
        return  (a+b+c)/3 ;
    }
        public static double modulo(float a, float b, float c){
           
        return  a%b%c ;
    }
}
