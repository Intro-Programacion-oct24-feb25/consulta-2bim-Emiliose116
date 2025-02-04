/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplorecursividadjava;

/**
 *
 * @author L E N O V O
 */
public class EjemploRecursividadJava {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }
}

