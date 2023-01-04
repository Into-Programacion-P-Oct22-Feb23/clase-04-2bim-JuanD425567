/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Scanner;

public class Ejemplo081 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String mensajeSuma;
        String mensajeSumaDos;
        System.out.println("Ingrese un numero para el tipo de operacion");
        int numero= entrada.nextInt();
        if (numero == 1) {
            mensajeSuma=obtenerTablaSumar(10,9);
            System.out.println(mensajeSuma);
        }
        if (numero == 2) {
            mensajeSumaDos=obtenerTablaMultiplicar(10,9);
            System.out.println(mensajeSumaDos);
        }
        if (numero !=1 &&numero !=2) {
         System.out.println("Error, numero invalido");
        }
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
