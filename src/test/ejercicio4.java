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
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c,f;
        System.out.println("Ingrese la temperatura en grados Centígrados");
        c = leer.nextInt();
        f = 32+(9*c/5);
        System.out.println("La temperatura en grados Fahrenheit es: "+f+"°");
        
    }
}
