/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        int op=0;
    do{
    op=Integer.parseInt(JOptionPane.showInputDialog("\tMENU de Mascotas\n"+
            
            "Escoja una opcion para ver su contenido:\n "+
            "[1] Gato\n"+
            "[2] Perro\n"+
            "[3] loro\n"+
            "[4] conejo\n"+
            "[5] Salir\n"));
         switch(op)
            {
             case 1:
               JOptionPane.showMessageDialog(null,"Caracteristica:\n"+
                                                    "Color: Amarillo\n peso: 15 kg");
         }
         switch(op)
         {
         case 2:
             JOptionPane.showMessageDialog(null,"Caracteristica:\n"+
                                                    "Color: Negro\n peso: 37 kg");
         }
          switch(op)
         {
         case 3:
             JOptionPane.showMessageDialog(null,"Caracteristica:\n"+
                                                    "Color: Verde\n peso: 0.5 kg");
         }
           switch(op)
         {
         case 4:
             JOptionPane.showMessageDialog(null,"Caracteristica:\n"+
                                                    "Color: Gris\n peso: 10 kg");
         }
        }while(op!=5);
    }
}
