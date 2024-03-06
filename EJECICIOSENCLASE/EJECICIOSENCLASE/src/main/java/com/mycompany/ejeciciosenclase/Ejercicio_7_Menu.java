
package com.mycompany.ejeciciosenclase;

import java.util.Scanner;

public class Ejercicio_7_Menu {

    public static void main(String[] args) {
        

        int opcion=0;
        Scanner entrada = new Scanner(System.in);
        
        while(opcion!=5){
            System.out.println("********** MENU DE OPCIONES **********");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar"); 
            System.out.println("4. Dividir"); 
            System.out.println("0. Salir");         
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Escogiste sumar");
                    break;
                case 2: 
                    System.out.println("Escogiste restar"); 
                    break;
                case 3: 
                    System.out.println("Escogiste Multiplicar"); 
                    break;
                case 4: 
                    System.out.println("Escogiste Dividir"); 
                    break;
                case 0:
                    System.out.println("Hasta pronto!");                                
            }
        }
     }    
}



