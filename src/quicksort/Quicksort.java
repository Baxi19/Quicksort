/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author toshib
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {5,4,3,2,1};
        Ordenador2 a = new Ordenador2();
        a.quick(numeros,0, numeros.length -1 );
    }
    
}
