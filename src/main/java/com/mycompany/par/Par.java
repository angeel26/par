/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.par;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Par {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Vamos a determinar si un numero es par");
        System.out.println("Ingrese el numero:");
        
        int num1 = leer.nextInt();
        
        if(num1%2==0){
            System.out.println("Este numero es par");
        }else{
            System.out.println("Este numero es impar");
        }
    }
}
