
package com.mycompany.laboratorios_ada;

import java.util.Random;
import java.util.Scanner;

public class laboratorio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de numeros de la lista: ");
        int cantidad = scanner.nextInt();
        int[] listaNumeros = new int [cantidad];
        listaNumeros = generarLista(cantidad);
        int sumaMax = sumaMaxima(listaNumeros);
        System.out.println("\nLa suma maxima del arreglo es: " + sumaMax);
    }
    
    public static int[] generarLista(int cantidad){
        Random random = new Random();
        int[] listaNumeros = new int[cantidad];
        System.out.println("\nLa lista contiene los siguiente numeros:");
        for (int i = 0; i < cantidad; i++){
            int valor = random.nextInt(21) - 10; 
            listaNumeros[i] = valor;
            System.out.print(listaNumeros[i] + ", ");
        }
        return listaNumeros;
    }
    
    public static int sumaMaxima(int[] listaNumeros){
        int maxHastaAhora = 0;
        int maxTerminandoAqui = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            maxTerminandoAqui = maxTerminandoAqui + listaNumeros[i];
            
            if (maxTerminandoAqui < 0) {
                maxTerminandoAqui = 0;
            }

            if (maxTerminandoAqui > maxHastaAhora) {
                maxHastaAhora = maxTerminandoAqui;
            }
        }
        return maxHastaAhora;
    }
    
}
