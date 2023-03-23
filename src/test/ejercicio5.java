/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author xrod2
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un valor numerico");
        num = leer.nextInt();
        System.out.println("su doble es: "+num*2);
        System.out.println("su triple es: "+num*3);
        System.out.println("su raiz cuadrada es: "+sqrt(num));
    }
}
