/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd4iterativa;

import java.util.Scanner;

/** This program asks for a number and returns the multiplication table of the
 * given number
 *
 * @author Óscar Llamas Parra
 */
public class Main {
    public static int n;//the number the user is going to type
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca número entero positivo");
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        
        while(n<=0){
            System.out.println("Error en la entrada");
            System.out.println("Introduzca número entero positivo");
            reader = new Scanner(System.in);
            n = reader.nextInt();
        }
        
        for(int i=0;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
    
}
