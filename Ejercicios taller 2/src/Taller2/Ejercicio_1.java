
package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Ejercicio_1 {
    public static void main(String[] args) throws IOException {
     
      Scanner entrada=new Scanner (System.in);
  System.out.print("Digite un numero ");
     int num1 = entrada.nextInt();
        System.out.print("Digite un ultimo numero ");
     int num2 = entrada.nextInt();
      
        System.out.printf("x=%d\n", num1);
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, ( num1 + num1 ) );
        
         System.out.printf("x=%.2f\n", x(num1,num2));
         System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) );
         
         
         
    }
        public static double x(int a, int b){
           
        return (double) a / 1 ;
    }
        
    }

