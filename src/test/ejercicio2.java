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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre del usuario");
        nombre = leer.next();
        System.out.println("Su nombre es: "+nombre);
    }
}
