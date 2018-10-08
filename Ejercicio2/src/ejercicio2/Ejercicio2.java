/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba de cuanto quiere la serie: ");
         Scanner e = new Scanner(System.in);
        int n = e.nextInt();
        int primo = 1;
        int contador = 2;
        int d = 2;
        while (primo <= n) {
            if (contador % d == 0) {
                if (contador == d) {
                    System.out.print(contador + ", ");
                    primo++;
                }
                d = 2;
                contador++;
            } else {
                d++;
            }
        }
    }
}

