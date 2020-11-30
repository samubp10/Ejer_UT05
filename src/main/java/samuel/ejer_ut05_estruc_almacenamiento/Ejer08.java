/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ejer_ut05_estruc_almacenamiento;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Ejer08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numeroEntero;
        System.out.println("Escriba el número de enteros por el que quiere que esté relleno el array ");
        numero = teclado.nextInt();
        int[] numeros = new int[numero];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el " + numero + " numero: ");
            numeroEntero = teclado.nextInt();
            numeros[i] = numeroEntero;
            numero--;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            for(int z = 0; z < numeros[i]; z++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
