/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author xrod2
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el un valor numerico");
        num1 = leer.nextInt();
        System.out.println("Ingrese el un segundo valor numerico");
        num2 = leer.nextInt();
        System.out.println("el primer valor es: "+num1+" y el seguno valor es: "+num2);
    }
}
