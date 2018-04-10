
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
        int[] numeros = {4,5,2,3,6,1};
        Ordenador2 quicksort = new Ordenador2();
        quicksort.quick(numeros,0, numeros.length -1 );
    }
    
}
