/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Randald
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {4,3,1,2};
        Ordenador2 a = new Ordenador2();
        a.quick(numeros,0, numeros.length -1 );
    }
    
}
