/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class S07ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Creando un objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Mostrar mensaje al usuario
        System.out.println("INGRESE LA CANTIDAD DE AGUA EN KILOMETROS: ");
        double kilogramos = input.nextDouble();
        System.out.println("INGRESE LA TEMPERATURA INICIAL: ");
        double temperaturaInicial = input.nextDouble();
        System.out.println("INGRESE LA TEMPERATURA FINAL: ");
        double temperaturaFinal = input.nextDouble();
        
        //Calculando la energia
        double energia = kilogramos * (temperaturaFinal - temperaturaInicial) * 4184;
        
        //Mostrando el resultado
        System.out.println("LA ENERGIA REQUERIDA ES: " + energia + "jules");
        

        
        //
        
    }
    
}
