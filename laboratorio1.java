
package com.mycompany.laboratorios_ada;
import java.util.Scanner;

public class laboratorio1 {
    
    public static void main(String[] args) {
        int n = solicitarNumero();
        int[][] cuadradoMagico = crearCuadradoMagico(n);
        mostrarCuadradoMagico(cuadradoMagico);
        mostrarSumaMagica(n);
    }
    
    public static int solicitarNumero(){
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do{
            System.out.print("Ingresa un numero impar: ");
            numero = scanner.nextInt();
            
            if (numero % 2 == 0){
                System.out.println("El numero es par, intenta de nuevo");
            }
            
            if (numero <= 0){
                System.out.println("El numero debe ser positivo. Intente de nuevo");
            }
        } while (numero % 2 == 0 || numero <= 0);
        
        return numero;
    }
    
    public static int[][] crearCuadradoMagico(int n){
        int [][] cuadrado = new int [n][n];
        int numero = 1;
        int i = 0;
        int j = n / 2;

        while (numero <= n * n) {
            cuadrado[i][j] = numero;

            numero++;
            int nuevoI = (i - 1 + n) % n; 
            int nuevoJ = (j + 1) % n;   

            if (cuadrado[nuevoI][nuevoJ] != 0) {
                i = (i + 1) % n; 
            } else {
                i = nuevoI;
                j = nuevoJ;
            }
        }

        return cuadrado;
    }
    
    public static void mostrarCuadradoMagico(int[][] cuadrado){
        System.out.println("\nCuadrado Magico de orden " + cuadrado.length + ":");
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.printf("%4d", cuadrado[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void mostrarSumaMagica(int n){
        int sumaMagica = n * (n * n + 1) / 2;
        System.out.println("La suma magica S es: " + sumaMagica);
    }
}
